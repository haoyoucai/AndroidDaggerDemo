package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import android.app.Application;

import com.example.danlai.androiddaggerdemo.App;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.module.AppModule;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.AppScope;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/22.
 */
//@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App application);

    Apple getApple();
}
