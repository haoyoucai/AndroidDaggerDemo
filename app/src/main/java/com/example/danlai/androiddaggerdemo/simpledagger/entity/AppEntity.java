package com.example.danlai.androiddaggerdemo.simpledagger.entity;

import javax.inject.Inject;

/**
 * Created by DanLai on 2018/3/22.
 */

public class AppEntity {
//    @Inject
//    public AppEntity() {
//    }

    public String whoAmI() {
        return "I am an  app entity!" + toString();
    }
}
