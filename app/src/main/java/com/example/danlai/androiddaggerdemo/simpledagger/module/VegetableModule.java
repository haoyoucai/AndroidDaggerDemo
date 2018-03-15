package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Potato;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Tomato;

import dagger.Module;
import dagger.Provides;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （蔬菜module！！）
 */

@Module
public class VegetableModule {
    @Provides
    Potato providePatato() {
        return new Potato();
    }
    @Provides
    Tomato provideTomato() {
        return new Tomato();
    }

}
