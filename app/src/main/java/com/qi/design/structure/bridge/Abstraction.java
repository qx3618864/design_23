package com.qi.design.structure.bridge;

/**
 * 20200616
 * qi
 * 这是一个抽象类  没有和Implementor 有继承关系而是使用了组合
 *
 * 这个抽象类假设是手机ide意思
 *
 */
public  abstract class Abstraction {
    Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public  abstract  void  zuhe();
}
