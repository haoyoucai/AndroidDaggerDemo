package com.example.danlai.androiddaggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.ActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.GreenColor;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.NoColor;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.RedColor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    @Inject
    @NoColor
    Apple apple;
    @Inject
    @NoColor
    Apple apple2;
    @Inject
    @RedColor
    Apple apple3;
    @Inject
    @RedColor
    Apple apple4;

    @Inject
    @GreenColor
    Apple apple5;
    @Inject
    @GreenColor
    Apple apple6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取app中的Component
        ActivityComponent appComponent = DaggerActivityComponent.create();
        appComponent.inject(this);
        //上面两行代码可以简写如下：
        //        DaggerActivityComponent.create().inject(this);
        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, apple2.whoAmI());
        Log.e(TAG, apple3.whoAmI());
        Log.e(TAG, apple4.whoAmI());
        Log.e(TAG, apple5.whoAmI());
        Log.e(TAG, apple6.whoAmI());
    }

}


