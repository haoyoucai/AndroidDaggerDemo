package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Water;

import dagger.Module;
import dagger.Provides;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/15
 * @description： （一句话解释一下！！）
 */
@Module
public class WaterModule {

    @Provides
    Water provideWater() {
        return new Water();
    }

}
