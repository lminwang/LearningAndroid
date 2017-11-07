package com.lminwang.android.learningandroid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lminwang.android.learningandroid.R;
import com.lminwang.android.learningandroid.adapter.MainRecyclerAdapter;
import com.lminwang.android.learningandroid.adapter.MyDecoration;
import com.lminwang.android.learningandroid.bean.ActivityBean;

import java.util.ArrayList;

import static com.lminwang.android.learningandroid.adapter.MyDecoration.VERTICAL_LIST;

public class MainActivity extends BaseActivity {


    private RecyclerView mRecyclerView;

    private MainRecyclerAdapter mAdapter;

    private ArrayList<ActivityBean> mDataSets;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildData();
        mAdapter = new MainRecyclerAdapter(mDataSets);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new MyDecoration(this, VERTICAL_LIST));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new MainRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, mDataSets.get(position).getClazz());
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        mRecyclerView = findViewById(R.id.main_recycler);
    }

    private void buildData() {
        mDataSets = new ArrayList<>();
        mDataSets.add(new ActivityBean("TouchEventDispatch", DispatchEventActivity.class));
        mDataSets.add(new ActivityBean("ConstraintLayout", ConstraintActivity.class));
    }
}
