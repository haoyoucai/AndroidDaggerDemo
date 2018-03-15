package com.example.danlai.androiddaggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerActivityComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerFireComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.DaggerFoodComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.FireComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.componet.FoodComponent;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Apple;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Fire;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Pear;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Potato;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Tomato;
import com.example.danlai.androiddaggerdemo.simpledagger.entity.Water;
import com.example.danlai.androiddaggerdemo.simpledagger.module.FruitModule;
import com.example.danlai.androiddaggerdemo.simpledagger.module.VegetableModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Apple apple;

    @Inject
    Pear pear;

    @Inject
    Tomato tomato;

    @Inject
    Potato potato;

    @Inject
    Water water;

    @Inject
    Fire fire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerActivityComponent.builder().fruitModule(new FruitModule()).vegetableModule(new VegetableModule()).build().inject(this);
        FoodComponent foodComponent = DaggerFoodComponent.create();
        FireComponent fireComponent = DaggerFireComponent.create();
        DaggerActivityComponent.builder().foodComponent(foodComponent).fireComponent(fireComponent).build().inject(this);

        Log.e(TAG, apple.whoAmI());
        Log.e(TAG, pear.whoAmI());
        Log.e(TAG, tomato.whoAmI());
        Log.e(TAG, potato.whoAmI());
        Log.e(TAG, water.whoAmI());
        Log.e(TAG, fire.whoAmI());
    }
}


