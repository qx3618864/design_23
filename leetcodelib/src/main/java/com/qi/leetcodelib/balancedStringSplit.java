package com.qi.leetcodelib;

public class balancedStringSplit {
    public static void main(String[] args) {

        String s = "RLRRLLRLRL";
        balancedStringSplit(s);
    }

    public static int balancedStringSplit(String s) {
        char[] chars = new char[s.length()];
        chars = s.toCharArray();
        int biaoji = 0;
        int simple = 1;
        int b = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                simple++;

            } else {
                i = i + simple;

                simple = 1;
                biaoji += 1;
            }
        }
        return biaoji;

    }
}
