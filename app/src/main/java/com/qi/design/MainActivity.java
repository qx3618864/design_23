package com.qi.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qi.design.creat.factory.AFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         // 1 工厂模式
        AFactory aFactory  = new AFactory();
        aFactory.to_do();
    }
}
