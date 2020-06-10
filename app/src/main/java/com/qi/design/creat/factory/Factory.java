package com.qi.design.creat.factory;

public abstract  class Factory {

     public  abstract  product  getProduct();



     public   void   to_do(){
         getProduct().to_do();
     }
}
