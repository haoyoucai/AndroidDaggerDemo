package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

import javax.inject.Named;

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
    @Named("noColor")
    Apple provideApple() {
        return new Apple();
    }


    @Provides
    @Named("redColor")
    Apple provideApple2() {
        return new Apple("red");
    }

}
