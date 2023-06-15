package com.example.test.ui.goals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.databinding.GoalFragmentBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class GoalFragment extends Fragment {

    private GoalFragmentBinding binding;

    //private ContentMainGoalsBinding contentbinding;

    public static final int NEW_WORD_ACTIVITY_REQUEST_CODE = 1;

    public GoalsViewModel mGoalsViewModel;

    public FloatingActionButton fab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        //GoalsViewModel goalsViewModel = new ViewModelProvider(this).get(GoalsViewModel.class);

        binding = GoalFragmentBinding.inflate(inflater, container, false);
        //contentbinding = ContentMainGoalsBinding.inflate(inflater, container, false);

        View root = binding.getRoot();
        //View contentroot = contentbinding.getRoot();

        RecyclerView recyclerView = binding.recyclerview;
        final GoalListAdapter adapter = new GoalListAdapter(this.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));



        // Get a new or existing ViewModel from the ViewModelProvider.
        mGoalsViewModel = new ViewModelProvider(this).get(GoalsViewModel.class);

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.
        mGoalsViewModel.getAllWords().observe((LifecycleOwner) this.getViewLifecycleOwner(), new Observer<List<Word>>() {
            @Override
            public void onChanged(@Nullable final List<Word> words) {
                // Update the cached copy of the words in the adapter.
                adapter.setWords(words);
            }
        });

        TextView emptyView = (TextView) binding.emptyView;

        if (adapter.getItemCount() == 0) {
            emptyView.setVisibility(View.VISIBLE);
        }
        else {
            emptyView.setVisibility(View.GONE);
        }

        fab = binding.fab;

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), NewGoalActivity.class);
                startActivityForResult(intent, NEW_WORD_ACTIVITY_REQUEST_CODE);
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
                    // When the use swipes a word,
                    // delete that word from the database.
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                        int position = viewHolder.getAdapterPosition();
                        Word myWord = adapter.getWordAtPosition(position);
                        Toast.makeText(getContext(),
                                getString(R.string.delete_word_preamble) + " " +
                                        myWord.getWord(), Toast.LENGTH_LONG).show();

                        // Delete the word
                        mGoalsViewModel.deleteWord(myWord);
                    }
                });
        // Attach the item touch helper to the recycler view
        helper.attachToRecyclerView(recyclerView);

//        final TextView textView = binding.textGoals;
//        goalsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_WORD_ACTIVITY_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Word word = new Word(data.getStringExtra(NewGoalActivity.EXTRA_REPLY));
            mGoalsViewModel.insert(word);
        } else {
            Toast.makeText(
                    getContext().getApplicationContext(),
                    R.string.emptygoal_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }
}