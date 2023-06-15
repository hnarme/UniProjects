package com.example.test.ui.mysavings;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SavingDao {

    @Query("SELECT * from saving_table ORDER BY saving ASC")
    LiveData<List<Saving>> getAlphabetizedWords();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Saving saving);

    @Query("DELETE from saving_table")
    void deleteAll();

    @Delete
    void deleteSaving(Saving saving);

    @Query("SELECT * from saving_table LIMIT 1")
    Saving[] getAnySaving();

    @Query("SELECT * from saving_table ORDER BY saving ASC")
    LiveData<List<Saving>> getAllSavings();
}
