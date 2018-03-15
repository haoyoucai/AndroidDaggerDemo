package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Water;
import com.example.danlai.androiddaggerdemo.simpledagger.module.WaterModule;

import dagger.Component;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （提取的base Component
 * ）
 */
@Component(modules = WaterModule.class)
public interface FoodComponent {

    Water getWater();

}
