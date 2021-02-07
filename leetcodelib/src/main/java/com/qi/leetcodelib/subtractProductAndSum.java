package com.qi.leetcodelib;

public class subtractProductAndSum {
    public static void main(String[] args) {
        int a = 234;

        subtractProductAndSum(234);
    }

    public static int subtractProductAndSum(int n) {
        int ji = 1;
        int he = 0;

        char[] a = String.valueOf(n).toCharArray();
        for (char c : a) {
            ji = ji * (c-48);
            he += (c-48);

        }
        return ji - he;


    }
}
