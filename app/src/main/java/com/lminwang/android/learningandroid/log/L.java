package com.lminwang.android.learningandroid.log;

import android.os.Build;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jieqiong on 2016/7/5.
 */
public class L {
    public static final String LOG_TAG = "LearningAndroid";

    private static final String VERSION_ENG = "eng";
    private static final String VERSION_USER = "user";
    private static final String VERSION_USER_DEBUG = "userdebug";

    private static final int TYPE_VERBOSE = 1;
    private static final int TYPE_DEBUG = 1 << 1;
    private static final int TYPE_INFO = 1 << 2;
    private static final int TYPE_WARING = 1 << 3;
    private static final int TYPE_ERROR = 1 << 4;
    private static final int TYPE_ALL =
            TYPE_VERBOSE | TYPE_DEBUG | TYPE_INFO | TYPE_WARING | TYPE_ERROR;
    private static final int TYPE_USER = TYPE_INFO | TYPE_WARING | TYPE_ERROR;

    private static int sType = TYPE_ALL;

    static {
        switch (Build.TYPE) {
            case VERSION_USER:
                sType = TYPE_USER;
                break;
            case VERSION_ENG:
            case VERSION_USER_DEBUG:
                sType = TYPE_ALL;
                break;
            default:
                Log.e(LOG_TAG, "unknown build type, type = " + Build.TYPE);
                break;
        }
    }

    public static void v(String tag, String msg) {
        if (0 != (sType & TYPE_VERBOSE)) {
            Log.v(LOG_TAG, tag + " :: " + msg);
        }
    }


    public static void d(String tag, String msg) {
        if (0 != (sType & TYPE_DEBUG)) {
            Log.d(LOG_TAG, tag + " :: " + msg);
        }
    }

    public static void i(String tag, String msg) {
        if (0 != (sType & TYPE_INFO)) {
            Log.i(LOG_TAG, tag + " :: " + msg);
        }
    }

    public static void w(String tag, String msg) {
        if (0 != (sType & TYPE_WARING)) {
            Log.w(LOG_TAG, tag + " :: " + msg);
        }
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (0 != (sType & TYPE_WARING)) {
            Log.w(LOG_TAG, tag + " :: " + msg, tr);
        }
    }

    public static void e(String tag, String msg) {
        if (0 != (sType & TYPE_ERROR)) {
            Log.e(LOG_TAG, tag + " :: " + msg);
        }
    }
}
