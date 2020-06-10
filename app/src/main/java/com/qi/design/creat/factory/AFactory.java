package com.qi.design.creat.factory;

public class AFactory extends  Factory {
    @Override
    public product getProduct() {
        return new Aproduct();
    }
}
