package com.example.danlai.androiddaggerdemo.simpledagger.module;

import com.example.danlai.androiddaggerdemo.simpledagger.entity.ActivityEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.AppEntity;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.ActivityScope;
import com.example.danlai.androiddaggerdemo.simpledagger.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by DanLai on 2018/3/22.
 */


//@AppScope
@Module
public class AppModule {
//    @AppScope
//    @Provides
//    AppEntity provideAppEntity() {
//        return new AppEntity();
//    }
//    @AppScope
//    @Provides
//    ActivityEntity provideActivityEntity() {
//        return new ActivityEntity();
//    }

//    @AppScope
    @Provides
    Apple provideApple(){
        return new Apple();
    }
}
