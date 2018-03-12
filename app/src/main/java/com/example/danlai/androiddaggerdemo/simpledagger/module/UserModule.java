package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.Group;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.User;

import dagger.Module;
import dagger.Provides;

/**
 * @author： 沈丹来 shendanlai@tniu.com
 * @date： 2018/03/12
 * @description： （一句话解释一下！！）
 */

@Module
public class UserModule {

    @Provides
    /**
     * 这就是简单的没有构造参数的情况
     * 1、这种情况可以解决没法改写的第三方库
     * 应为不需要在构造方法上面添加@Inject
     *
     *  http://johnnyshieh.me/posts/dagger-use-in-android/
     *
     *
     */


    User provideUser() {
        return new User();
    }

    @Provides
    Group provideGroip() {
        return new Group();
    }

}
