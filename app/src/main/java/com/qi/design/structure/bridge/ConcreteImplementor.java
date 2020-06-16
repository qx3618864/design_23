package com.qi.design.structure.bridge;

public class ConcreteImplementor implements Implementor {
    @Override
    public void xinghao(String a) {
        System.out.println("这是一个型号"+a);

    }
}
