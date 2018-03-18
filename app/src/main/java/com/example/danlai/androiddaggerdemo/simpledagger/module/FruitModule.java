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

    private String appleColor, pearColor;

    public FruitModule(String appleColor, String pearColor) {
        this.appleColor = appleColor;
        this.pearColor = pearColor;
    }

    @Provides
    Apple provideApple() {
        return new Apple(appleColor);
    }

    @Provides
    Pear providePear() {
        return new Pear(pearColor);
    }
}
