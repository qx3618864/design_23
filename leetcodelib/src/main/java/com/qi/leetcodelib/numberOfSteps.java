package com.qi.leetcodelib;

public class numberOfSteps {
    public static void main(String[] args) {

    }

    public int numberOfSteps (int num) {
        int i = 0 ;
        while (num==0){
            if(num%2==1){
                num--;
            }else{
                num = num/2;
            }
            i++;
        }
        return  i;


    }
}
