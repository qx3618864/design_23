package com.qi.leetcodelib;

public class reverseLeftWords {
    public static void main(String[] args) {
        String a = "abcdefg";
        reverseLeftWords(a,2);

    }

    public static String reverseLeftWords(String s, int n) {
        String name;
        char[] cs = new char[s.length()];
        char[] cscopy = new char[s.length()];
        int cscopyint=0;
        for(int i=0;i<s.length();i++){
            cs[i]=s.charAt(i);
        }


        for(int i=0;i<s.length()-n;i++){
            cscopy[cscopyint]=s.charAt(i+n);
            cscopyint++;
        }
        for(int i=0;i<n;i++){
            cscopy[s.length()-n+i]=s.charAt(i);

        }
        System.out.println(cscopy.toString());
        return  String.valueOf(cscopy);

    }
}
