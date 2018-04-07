package com.example.danlai.androiddaggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.ActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Apple apple;
    @Inject
    Apple apple2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dagger shi
        ActivityComponent activityComponent = DaggerActivityComponent.create();
        activityComponent.inject(this);
        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, apple2.whoAmI());
    }
}


