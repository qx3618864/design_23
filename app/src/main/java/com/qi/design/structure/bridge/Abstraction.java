package com.qi.design.structure.bridge;

/**
 * 20200616
 * qi
 * 这是一个抽象类  没有和Implementor 有继承关系而是使用了组合
 *
 * 这个抽象类假设是手机ide意思
 *
 * 当一个类有多个维度的时候 那么就需要用桥接模式
 * 减少继承 多用关联
 * 比如  咖啡 有大杯 小杯  有糖无糖
 *
 */
public  abstract class Abstraction {
    Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public  abstract  void  zuhe();
}
