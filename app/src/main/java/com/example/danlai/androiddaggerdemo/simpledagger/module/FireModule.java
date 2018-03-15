package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Fire;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanLai on 2018/3/15.
 */


@Module
public class FireModule {

    @Provides
    Fire provideFire() {
        return new Fire();
    }
}
