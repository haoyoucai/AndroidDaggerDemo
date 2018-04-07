package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

@MyScope
@Component(modules = FruitModule.class)
public interface ActivityComponent {
    void inject(MainActivity appCompatActivity);
}
