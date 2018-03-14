package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;
import com.example.danlai.androiddaggerdemo.simpledagger.module.VegetableModule;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

@Component(modules = {FruitModule.class, VegetableModule.class})
public interface ActivityComponent {

    void inject(MainActivity appCompatActivity);
}
