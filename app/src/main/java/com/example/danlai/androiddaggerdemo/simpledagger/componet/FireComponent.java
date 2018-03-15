package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Fire;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FireModule;

import dagger.Component;

/**
 * Created by DanLai on 2018/3/15.
 */


@Component(modules = FireModule.class)
public interface FireComponent {
    Fire burnFire();
}
