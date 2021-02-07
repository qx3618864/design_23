package com.qi.leetcodelib;

public class arrayStringsAreEqual {
    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (String s : word1) {
            stringBuffer.append(s); // zheshi yige ceshi
        }


        for (String s : word2) {
            stringBuffer1.append(s);
        }

        if(String.valueOf(stringBuffer).equals(String.valueOf(stringBuffer1))){
            return true;
        }else {
            return false;
        }


    }
}
