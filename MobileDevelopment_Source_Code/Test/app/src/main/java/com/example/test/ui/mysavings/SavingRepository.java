package com.example.test.ui.mysavings;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class SavingRepository {

    private SavingDao mSavingDao;
    private LiveData<List<Saving>> mAllSavings;

    SavingRepository(Application application) {
        SavingRoomDatabase db = SavingRoomDatabase.getDatabase(application);
        mSavingDao = db.savingDao();
        mAllSavings = mSavingDao.getAllSavings();
    }

    LiveData<List<Saving>> getAllSavings()
    {
        return mAllSavings;
    }

    public void insert (Saving saving) { new insertAsyncTask(mSavingDao).execute(saving);}

    public void deleteAll() { new insertAsyncTask.deleteAllSavingsAsyncTask(mSavingDao).execute(); }

    public void deleteSaving(Saving saving) { new insertAsyncTask.deleteSavingAsyncTask(mSavingDao).execute(saving); }

    /**
     * Insert a saving amount into the database.
     */
    private static class insertAsyncTask extends AsyncTask<Saving, Void, Void> {

        private SavingDao mAsyncTaskDao;

        insertAsyncTask(SavingDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Saving... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }

        /**
         * Delete all saving amounts from the database (does not delete the table)
         */
        private static class deleteAllSavingsAsyncTask extends AsyncTask<Void, Void, Void> {
            private SavingDao mAsyncTaskDao;

            deleteAllSavingsAsyncTask(SavingDao dao) {
                mAsyncTaskDao = dao;
            }

            @Override
            protected Void doInBackground(Void... voids) {
                mAsyncTaskDao.deleteAll();
                return null;
            }
        }

        /**
         *  Delete a single saving amount from the database.
         */
        private static class deleteSavingAsyncTask extends AsyncTask<Saving, Void, Void> {
            private SavingDao mAsyncTaskDao;

            deleteSavingAsyncTask(SavingDao dao) {
                mAsyncTaskDao = dao;
            }

            @Override
            protected Void doInBackground(final Saving... params) {
                mAsyncTaskDao.deleteSaving(params[0]);
                return null;
            }
        }
    }

}
