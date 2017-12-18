package com.example.huan.customview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 每日一练01(2017.12.18)
 * 练习方面:自定义控件
 * 1，自定义View的属性
 * 2，在View的构造方法中获得我们自定义的属性
 * 3，重写onMeasure
 * 4，重写onDraw
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
