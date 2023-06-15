package com.example.test.ui.map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MapOptionsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MapOptionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Choose a Map View");
    }

    public LiveData<String> getText() {
        return mText;
    }
}