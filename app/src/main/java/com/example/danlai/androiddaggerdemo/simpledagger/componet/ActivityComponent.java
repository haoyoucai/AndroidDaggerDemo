package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;
import com.example.danlai.androiddaggerdemo.SecondActivity;
import com.example.danlai.androiddaggerdemo.simpledagger.module.ActivityModule;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.ActivityScope;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

//@ActivityScope
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity appCompatActivity);
    void inject(SecondActivity appCompatActivity);
}
