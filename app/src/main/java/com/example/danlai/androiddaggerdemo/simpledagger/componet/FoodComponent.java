package com.example.danlai.androiddaggerdemo.simpledagger.componet;

import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;

import dagger.Component;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （提取的base Component
 * ）
 */
@Component(modules = FruitModule.class)
public interface FoodComponent {

}
