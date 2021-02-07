package com.qi.leetcodelib;

public class minCount {
    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        minCount(a);
    }

    public static int minCount(int[] coins) {
        int i = 0;
        for (int coin : coins) {
            i += coin / 2 + coin % 2;
        }
        return i;

    }

}
