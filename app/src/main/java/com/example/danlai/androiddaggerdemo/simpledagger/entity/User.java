package com.example.danlai.androiddaggerdemo.simpledagger.entity;

import javax.inject.Inject;

/**
 * Created by DanLai on 2018/3/10.
 */

public class User {

    @Inject
    public User() {
    }

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

