package com.qi.design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qi.design.creat.factory.AFactory;
import com.qi.design.structure.bridge.Abstraction;
import com.qi.design.structure.bridge.ConcreteImplementor;
import com.qi.design.structure.bridge.Implementor;
import com.qi.design.structure.bridge.RefinedAbstraction;
import com.qi.design.structure.decorator.XiaoBing;
import com.qi.design.structure.decorator.Yingxiong;
import com.qi.design.structure.decorator.dijia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



         // 1 工厂模式
        AFactory aFactory  = new AFactory();
        aFactory.to_do();

        // 桥接模式
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction() ;
        abstraction.setImplementor(implementor);
        abstraction.zuhe();
        // 装饰着模式
        Yingxiong  xiaoBing  =  new XiaoBing();
        dijia dijia  = new dijia(xiaoBing);
        dijia.appenddengji("0");
        dijia.getDengji();
    }
}
