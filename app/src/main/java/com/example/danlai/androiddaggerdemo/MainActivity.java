package com.example.danlai.androiddaggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.AppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerAppComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.ActivityEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.AppEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.ActivityScope;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.AppScope;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Scope;

public class MainActivity extends AppCompatActivity {

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

    //    @Inject
//    ActivityEntity activityEntity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerActivityComponent.builder().fruitModule(new FruitModule()).vegetableModule(new VegetableModule()).build().inject(this);
//        DaggerActivityComponent.create().inject(this);
//        DaggerActivityComponent.create().inject(this);
//        Log.e(TAG, apple.whoAmI());
//        Log.e(TAG, apple2.whoAmI());
//        Log.e(TAG, apple3.whoAmI());
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

    public void goSecond(View v) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}


