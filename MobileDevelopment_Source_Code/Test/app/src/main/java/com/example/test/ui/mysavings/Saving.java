package com.example.test.ui.mysavings;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "saving_table")
public class Saving {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "saving")
    private String mSaving;

    public Saving(@NonNull String saving) {
        this.mSaving = saving;}

    public String getSaving(){return this.mSaving;}
}
