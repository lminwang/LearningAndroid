package com.lminwang.android.learningandroid.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.lminwang.android.learningandroid.log.L;

/**
 * Created by wangluomin on 2017/10/19.
 */

public class ViewThird extends View {

    private static final String TAG = "Third";

    public ViewThird(Context context) {
        super(context);
    }

    public ViewThird(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewThird(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewThird(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_UP:
                break;
            default:

        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = false;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                result = true;
                L.d(TAG, "onTouch ACTION_DOWN " + result);
                break;
            case MotionEvent.ACTION_MOVE:
//                getParent().requestDisallowInterceptTouchEvent(true);
                L.d(TAG, "onTouch ACTION_MOVE");

                break;
            case MotionEvent.ACTION_UP:
                L.d(TAG, "onTouch ACTION_UP");

                break;
            default:

        }

        return result;
    }
}
