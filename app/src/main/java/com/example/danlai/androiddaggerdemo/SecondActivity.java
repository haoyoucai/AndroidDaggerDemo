package com.example.danlai.androiddaggerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.ActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Pear;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import javax.inject.Inject;

/**
 * Created by DanLai on 2018/4/7.
 */
public class SecondActivity extends AppCompatActivity {
    public static final String TAG = SecondActivity.class.getSimpleName();

    @Inject
    Apple apple;
    @Inject
    Apple apple2;

    @Inject
    Pear pear;
    @Inject
    Pear pear2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActivityComponent activityComponent = DaggerActivityComponent.create();
        activityComponent.inject(this);
        //上面两行代码可以简写如下：
        //DaggerActivityComponent.create().inject(this);
        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, apple2.whoAmI());
        Log.e(TAG, pear.whoAmI());
        Log.e(TAG, pear2.whoAmI());
    }
}
