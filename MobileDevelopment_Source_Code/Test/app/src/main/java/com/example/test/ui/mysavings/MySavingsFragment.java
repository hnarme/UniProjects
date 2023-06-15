package com.example.test.ui.mysavings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.databinding.FragmentMysavingsBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.seismic.ShakeDetector;

import java.util.List;

public class MySavingsFragment extends Fragment implements ShakeDetector.Listener {

    private FragmentMysavingsBinding binding;

    private SensorManager sensorManager;
    private ShakeDetector shakeDetector;

    public static final int NEW_SAVING_ACTIVITY_REQUEST_CODE = 1;
    public MySavingsViewModel mySavingsViewModel;

    public FloatingActionButton fab;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        MySavingsViewModel mySavingsViewModel =
//                new ViewModelProvider(this).get(MySavingsViewModel.class);

        binding = FragmentMysavingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        sensorManager = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);

        shakeDetector = new ShakeDetector(this);

        shakeDetector.start(sensorManager);

//        final TextView textView = binding.textSavings;
//        mySavingsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        RecyclerView recyclerView = binding.recyclerview;
        final SavingListAdapter adapter = new SavingListAdapter(this.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        mySavingsViewModel = new ViewModelProvider(this).get(MySavingsViewModel.class);
        mySavingsViewModel.getAllSavings().observe((LifecycleOwner) this.getViewLifecycleOwner(), new Observer<List<Saving>>()
        {
            @Override
            public void onChanged(@Nullable final List<Saving> savings) {
                // Update the cached copy of the savings amounts in the adapter.
                adapter.setSavings(savings);
            }
        });

        fab = binding.fab;

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), NewSavingActivity.class);
                startActivityForResult(intent, NEW_SAVING_ACTIVITY_REQUEST_CODE);
            }
        });

        ItemTouchHelper helper = new ItemTouchHelper(
                new ItemTouchHelper.SimpleCallback(0,
                        ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
                    @Override
                    // We are not implementing onMove() in this app
                    public boolean onMove(RecyclerView recyclerView,
                                          RecyclerView.ViewHolder viewHolder,
                                          RecyclerView.ViewHolder target) {
                        return false;
                    }

                    @Override
                    // When the use swipes a saving amount,
                    // delete that saving amount from the database.
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                        int position = viewHolder.getAdapterPosition();
                        Saving mySaving = adapter.getSavingAtPosition(position);
                        Toast.makeText(getContext(),
                                getString(R.string.delete_saving_preamble) + " " +
                                        mySaving.getSaving(), Toast.LENGTH_LONG).show();

                        // Delete the saving amount
                        mySavingsViewModel.deleteSaving(mySaving);
                    }
                });
        // Attach the item touch helper to the recycler view
        helper.attachToRecyclerView(recyclerView);

        return root;
    }

    @Override
    public void hearShake() {
        //Toast.makeText(MySavingsFragment.this.getContext(),"Shake has been detected !!!",Toast.LENGTH_SHORT).show();

        ImageView pigimg = (ImageView) binding.imageView6;
        ImageView whiteimg = (ImageView) binding.imageView;

        TextView shaketext = (TextView) binding.textSavings;

        pigimg.setVisibility(View.GONE);
        whiteimg.setVisibility(View.GONE);

        shaketext.setVisibility(View.GONE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_SAVING_ACTIVITY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Saving saving = new Saving(data.getStringExtra(NewSavingActivity.EXTRA_REPLY));
            mySavingsViewModel.insert(saving);
        } else {
            Toast.makeText(
                    getContext().getApplicationContext(),
                    R.string.emptygoal_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}