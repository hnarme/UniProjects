package com.example.test.ui.mysavings;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MySavingsViewModel extends AndroidViewModel {

    private SavingRepository mRepository;

    private LiveData<List<Saving>> mAllSavings;

    private final MutableLiveData<String> mText;

    public MySavingsViewModel(Application application) {
        super(application);
        mRepository = new SavingRepository(application);
        mAllSavings = mRepository.getAllSavings();

        mText = new MutableLiveData<>();
        mText.setValue("Shake Me!");
    }

    LiveData<List<Saving>> getAllSavings() { return mAllSavings; }

    public void insert(Saving saving) { mRepository.insert(saving); }

    public void deleteAll() {
        mRepository.deleteAll();
    }

    public void deleteSaving(Saving saving) {
        mRepository.deleteSaving(saving);
    }

    public LiveData<String> getText() {
        return mText;
    }
}