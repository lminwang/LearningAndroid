package com.lminwang.android.learningandroid.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 *
 * @author wangluomin
 * @date 2017/10/19
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initViews();
    }

    /**
     * 获取布局id
     *
     * @return layoutResId
     */
    @LayoutRes
    abstract protected int getLayoutId();

    /**
     * 初始化view
     */
    abstract public void initViews();
}
