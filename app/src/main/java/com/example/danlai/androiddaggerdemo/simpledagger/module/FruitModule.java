package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Pear;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanLai on 2018/3/21.
 */

@Module
public class FruitModule {

    //使用Scope修饰Apple的Provide
    @MyScope
    @Provides
    Apple provideApple() {
        return new Apple();
    }

    //不使用Scope修饰Pear的Provide
    @Provides
    Pear providePear() {
        return new Pear();
    }

}
