package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;
import com.example.danlai.androiddaggerdemo.simpledagger.module.UserModule;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

@Component(modules = UserModule.class)
public interface ActivityComponent {

    void inject(MainActivity appCompatActivity);
}
