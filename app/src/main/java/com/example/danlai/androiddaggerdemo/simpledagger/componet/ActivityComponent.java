package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/10.
 */

@Component(dependencies = FoodComponent.class)
public interface ActivityComponent {












    void inject(MainActivity appCompatActivity);
}
