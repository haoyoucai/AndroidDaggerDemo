package com.example.danlai.androiddaggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.ActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Pear;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Apple apple;
    @Inject
    Apple apple2;

    @Inject
    Pear pear;
    @Inject
    Pear pear2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取app中的Component
        ActivityComponent activityComponent = App.INSTANCE.getActivityComponent();
        activityComponent.inject(this);
        //上面两行代码可以简写如下：
        // App.INSTANCE.getActivityComponent().inject(this);
        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, apple2.whoAmI());
        Log.e(TAG, pear.whoAmI());
        Log.e(TAG, pear2.whoAmI());
    }

    public void goSecond(View view) {
        //跳转到SecondActivity
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }
}


