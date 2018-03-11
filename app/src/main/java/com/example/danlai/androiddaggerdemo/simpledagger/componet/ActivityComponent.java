package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import android.support.v7.app.AppCompatActivity;

import com.example.danlai.androiddaggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */


@Component
public interface ActivityComponent {
    void inject(MainActivity appCompatActivity);
}
