package com.example.test.ui.mysavings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

import java.util.List;

public class SavingListAdapter extends RecyclerView.Adapter<SavingListAdapter.SavingViewHolder> {

    private final LayoutInflater mInflator;
    private List<Saving> mSavings;

    SavingListAdapter(Context context) { mInflator = LayoutInflater.from(context);}

    @Override
    public SavingViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = mInflator.inflate(R.layout.recyclerview_saving, parent, false);
        return new SavingViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SavingViewHolder holder, int position) {
        if (mSavings != null) {
            Saving current = mSavings.get(position);
            holder.savingItemView.setText(current.getSaving());
        } else {
            holder.savingItemView.setText(R.string.no_saving);
        }
    }

    void setSavings(List<Saving> savings) {
        mSavings = savings;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mSavings != null)
            return mSavings.size();
        else return 0;
    }

    public Saving getSavingAtPosition(int position) {
        return mSavings.get(position);
    }

    class SavingViewHolder extends RecyclerView.ViewHolder {
        private final TextView savingItemView;

        private SavingViewHolder(View itemView) {
            super(itemView);
            savingItemView = itemView.findViewById(R.id.savingtextView);
        }
    }
}
