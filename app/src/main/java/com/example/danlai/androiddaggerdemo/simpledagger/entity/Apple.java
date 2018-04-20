package com.example.danlai.androiddaggerdemo.simpledagger.entity;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （苹果实体类）
 */
public class Apple {

    private String color = "no_color";

    public Apple() {

    }

    public Apple(String color) {
        this.color  = color;
    }

    public String whoAmI() {
        return "I am an "+color+" apple!" + toString();
    }
}
