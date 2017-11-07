package com.lminwang.android.learningandroid.activity;

import android.view.MotionEvent;

import com.lminwang.android.learningandroid.R;
import com.lminwang.android.learningandroid.log.L;

/**
 * Created by wangluomin on 2017/10/19.
 */

public class DispatchEventActivity extends BaseActivity {

    private static final String TAG = "DispatchEventActivity";

    @Override
    protected int getLayoutId() {
        return R.layout.activity_dispatch;
    }

    @Override
    public void initViews() {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                L.d(TAG, "onTouch ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                L.d(TAG, "onTouch ACTION_MOVE");

                break;
            case MotionEvent.ACTION_UP:
                L.d(TAG, "onTouch ACTION_UP");

                break;
            default:

        }
        return super.onTouchEvent(event);
    }
}
