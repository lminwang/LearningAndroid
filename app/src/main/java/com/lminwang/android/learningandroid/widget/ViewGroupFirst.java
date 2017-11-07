package com.lminwang.android.learningandroid.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.lminwang.android.learningandroid.log.L;

/**
 * Created by wangluomin on 2017/10/19.
 */

public class ViewGroupFirst extends LinearLayout {

    private static final String TAG = "First";

    public ViewGroupFirst(Context context) {
        super(context);
    }

    public ViewGroupFirst(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupFirst(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewGroupFirst(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = false;
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                L.d(TAG, "onIntercept ACTION_DOWN " + result);
                break;
            case MotionEvent.ACTION_MOVE:
                L.d(TAG, "onIntercept ACTION_MOVE " + result);

                break;
            case MotionEvent.ACTION_UP:
//                result = true;
                L.d(TAG, "onIntercept ACTION_UP " + result);

                break;
            default:

        }
        return result;
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
