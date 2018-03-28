package com.example.danlai.androiddaggerdemo.simpledagger.entity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （苹果实体类）
 */
public class Apple {

    public Apple() {
    }

    private String color;


    public String whoAmI() {
        return "I am an  apple!" + toString();
    }
}
