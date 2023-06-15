package com.example.test.ui.mysavings;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Saving.class}, version = 1,  exportSchema = false)
public abstract class SavingRoomDatabase extends RoomDatabase {

    public abstract SavingDao savingDao();

    private static SavingRoomDatabase INSTANCE;

    static SavingRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SavingRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SavingRoomDatabase.class, "saving_database")
                            // Wipes and rebuilds instead of migrating if no Migration object.
                            // Migration is not part of this codelab.
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static Callback sRoomDatabaseCallback = new Callback(){

        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
            // If you want to keep the data through app restarts,
            // comment out the following line.
            new PopulateDbAsync(INSTANCE).execute();
        }
    };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final SavingDao mDao;
        String [] savings = {};

        PopulateDbAsync(SavingRoomDatabase db) { mDao = db.savingDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {

            // If we have no savings, then create the initial list of savings amounts
            if (mDao.getAnySaving().length < 1) {
                for (int i = 0; i <= savings.length - 1; i++) {
                    Saving saving = new Saving(savings[i]);
                    mDao.insert(saving);
                }
            }
            return null;
        }
    }
}
