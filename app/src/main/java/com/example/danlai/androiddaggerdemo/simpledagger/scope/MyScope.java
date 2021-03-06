package com.example.danlai.androiddaggerdemo.simpledagger.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by DanLai on 2018/3/21.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface MyScope {}