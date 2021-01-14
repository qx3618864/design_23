package com.qi.design.structure.decorator;

public abstract  class YxDecorator implements  Yingxiong {
    protected  Yingxiong yingxiong;

    public YxDecorator(Yingxiong yingxiong) {
        this.yingxiong = yingxiong;
    }

    @Override
    public String getName() {
        return yingxiong.getName();
    }

    @Override
    public String getDengji() {
        return yingxiong.getDengji();
    }
}
