package com.example.danlai.androiddaggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.AppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerAppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.ActivityScope;

import javax.inject.Inject;

//@ActivityScope
public class SecondActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

//    @Inject
//    Apple apple;
//    @Inject
//    Apple apple2;
//    @Inject
//    Apple apple3;

    @Inject
    Apple apple;
    @Inject
    Apple apple2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        AppComponent appComponent = DaggerAppComponent.create();

        AppComponent appComponent = App.application.getAppComponent();
        DaggerActivityComponent.builder().appComponent(appComponent).build().inject(this);
//        DaggerActivityComponent.create().inject(this);
        Log.e(TAG, "======this is activity ====start ==========");
        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, apple2.whoAmI());


//        Log.e(TAG,appEntity.whoAmI());
//        Log.e(TAG,activityEntity.whoAmI());
        Log.e(TAG, "======this is activity ====end ==========");
    }
}
