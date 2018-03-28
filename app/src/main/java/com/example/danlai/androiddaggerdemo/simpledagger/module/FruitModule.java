package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanLai on 2018/3/21.
 */

@MyScope
@Module
public class FruitModule {

    @MyScope
    @Provides
    Apple provideApple() {
        return new Apple();
    }

}
