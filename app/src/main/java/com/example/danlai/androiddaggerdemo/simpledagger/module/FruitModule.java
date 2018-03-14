package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Pear;

import dagger.Module;
import dagger.Provides;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （水果Module）
 */

@Module
public class FruitModule {

    @Provides
    Apple provideApple() {
        return new Apple();
    }

    @Provides
    Pear providePear() {
        return new Pear();
    }

}
