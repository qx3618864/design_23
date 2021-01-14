package com.qi.design.structure.decorator;

public class dijia extends  YxDecorator {
    public dijia(Yingxiong yingxiong) {
        super(yingxiong);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDengji() {
        return super.getDengji();
    }
    //增加额外的操作
    public void appenddengji(String a){
        System.out.println(this.getDengji()+a);
    }
}
