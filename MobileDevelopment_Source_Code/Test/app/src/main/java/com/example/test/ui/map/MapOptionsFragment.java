package com.example.test.ui.map;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.test.R;
import com.example.test.databinding.FragmentMapoptionsBinding;

public class MapOptionsFragment extends Fragment {

    private FragmentMapoptionsBinding binding;

    private Button googleMapsButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MapOptionsViewModel mapOptionsViewModel =
                new ViewModelProvider(this).get(MapOptionsViewModel.class);

        binding = FragmentMapoptionsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Uri mapIntentUri = Uri.parse("geo:52.492826253570094, -1.891789782515701");
        googleMapsButton = binding.buttonGooglemap;
        googleMapsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                try
                {
                    startActivity(mapIntent);
                }
                catch(ActivityNotFoundException ex)
                {
                    System.out.println("Need to install the google maps application");
                }
            }
        });

        final TextView textView = binding.textNotifications;
        mapOptionsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button BackupActionButton = view.findViewById(R.id.button_overviewmap);
        BackupActionButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_navigation_mapoptions_to_gMap, null)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}