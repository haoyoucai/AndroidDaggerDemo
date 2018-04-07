package com.example.danlai.androiddaggerdemo;

import android.app.Application;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.ActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;

/**
 * Created by DanLai on 2018/4/7.
 */

public class App extends Application {

    public static App INSTANCE;

    ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        //在Application中实例化component
        activityComponent = DaggerActivityComponent.create();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
