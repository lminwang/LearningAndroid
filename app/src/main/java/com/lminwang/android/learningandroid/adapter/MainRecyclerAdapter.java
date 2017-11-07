package com.lminwang.android.learningandroid.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lminwang.android.learningandroid.R;
import com.lminwang.android.learningandroid.bean.ActivityBean;

import java.util.ArrayList;

/**
 * Created by wangluomin on 2017/10/19.
 */

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MyViewHolder>{

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    private ArrayList<ActivityBean> mDataSets;

    private OnItemClickListener mOnItemClickListener;

    public MainRecyclerAdapter(ArrayList<ActivityBean> sets) {
        mDataSets = sets;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_recycler, parent, false);
        final MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(myViewHolder.getAdapterPosition());
                }
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataSets.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mDataSets == null ? 0 : mDataSets.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.item_title);
        }
    }
}
