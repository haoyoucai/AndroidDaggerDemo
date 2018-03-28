package com.example.danlai.androiddaggerdemo;

import android.app.Application;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.AppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerAppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.ActivityEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.AppEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.module.AppModule;

import javax.inject.Inject;

/**
 * Created by DanLai on 2018/3/22.
 */


public class App extends Application {
    private final static String TAG = App.class.getSimpleName();

    public static App application;
    //
    @Inject
    Apple apple;
    private AppComponent appComponent;
//    @Inject
//    ActivityEntity activityEntity;

    @Override
    public void onCreate() {
        application = this;
//
        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);
        Log.e(TAG, "======this is application ====start ==========");
        Log.e(TAG, apple.whoAmI());
//        Log.e(TAG, activityEntity.whoAmI());
        Log.e(TAG, "======this is application ====end ==========");
        super.onCreate();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
