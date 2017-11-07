package com.lminwang.android.learningandroid.bean;

/**
 * Created by wangluomin on 2017/10/19.
 */

public class ActivityBean {

    private String name;
    private Class<?> activity;

    public ActivityBean(String name, Class<?> activity) {
        this.name = name;
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public Class<?> getClazz() {
        return activity;
    }
}
