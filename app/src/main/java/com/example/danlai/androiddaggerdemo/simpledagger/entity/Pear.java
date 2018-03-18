package com.example.danlai.androiddaggerdemo.simpledagger.entity;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/14
 * @description： （ 梨 的实体类）
 */
public class Pear {

    private String color;

    public Pear(String color) {
    this.color = color;
}

    public String whoAmI() {
        return "I am a " + color + " pear!";
    }

}
