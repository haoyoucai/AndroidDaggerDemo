package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

@Component(modules = FruitModule.class)
public interface ActivityComponent {

    void inject(MainActivity appCompatActivity);
}
