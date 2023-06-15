package com.example.test.ui.overview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.test.R;
import com.example.test.databinding.FragmentOverviewBinding;
import com.example.test.ui.mysavings.SavingListAdapter;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class OverviewFragment extends Fragment {

    private FragmentOverviewBinding binding;

    private YouTubePlayerView youTubePlayerView;

    private SavingListAdapter savingListAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OverviewViewModel overviewViewModel =
                new ViewModelProvider(this).get(OverviewViewModel.class);

        binding = FragmentOverviewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textOverview;
        overviewViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);



        //youTubePlayerView = binding.youtubePlayerView;

        //initYouTubePlayerView();
        return root;
    }

//    private void initYouTubePlayerView() {
//        youTubePlayerView.inflateCustomPlayerUi(R.layout.fragment_overview);
//
//        IFramePlayerOptions iFramePlayerOptions = new IFramePlayerOptions.Builder()
//                .controls(1)
//                .build();
//
//        getLifecycle().addObserver(youTubePlayerView);
//    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button SavingsCalActionButton = view.findViewById(R.id.button_savingcal);
        SavingsCalActionButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_navigation_overview_to_savingsCalculatorFragment, null)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}