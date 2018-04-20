package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.GreenColor;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.NoColor;
import com.example.danlai.androiddaggerdemo.simpledagger.qualifier.RedColor;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.MyScope;

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
    @NoColor
    Apple provideApple() {
        return new Apple();
    }

    @Provides
    @RedColor
    Apple provideAppleRed() {
        return new Apple("red");
    }

    @Provides
    @GreenColor
    Apple provideAppleGreen() {
        return new Apple("green");
    }

}
