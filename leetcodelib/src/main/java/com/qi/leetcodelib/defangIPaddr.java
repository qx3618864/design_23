package com.qi.leetcodelib;

public class defangIPaddr {
    public static void main(String[] args) {

    }

    public String defangIPaddr(String address) {
        char[] adressb= address.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : adressb) {
            if(String.valueOf(c).equals(".")){
                stringBuffer.append("[.]");

            }else{
                stringBuffer.append(c);
            }

        }
        return  stringBuffer.toString();

    }
}
