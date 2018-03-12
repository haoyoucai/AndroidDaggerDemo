package com.example.danlai.androiddaggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerActivityComponent.create().inject(this);
        user.setUserName("O'Neal");
        System.out.println(user.toString());
    }
}


