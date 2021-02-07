package com.qi.leetcodelib;

public class sortString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccczz";

        sortString(s);
    }

    public static String sortString(String s) {
        char[] o = s.toCharArray();
        char[] array = new char[s.length()];
        int[] allow = new int[26];
        int[] allow1 = new int[o.length];
        int num = 0;
        int biaoji = 0;

        for (char c : o) {
            allow[c - 'a'] += 1;
        }

        for (int i = 0; i < o.length; i++) {
            while (true) {
                if (allow[num] != 0) {
                    allow1[i] = num;
                    allow[num]--;
                    if (biaoji == 1 && num > 0) {
                        num--;

                    } else if (biaoji == 0 && num < 25) {
                        num++;
                    } else {
                        if (num == 25) {
                            biaoji = 1;
                        }
                        if (num == 0) {
                            biaoji = 0;
                        }
                    }
                    break;
                } else {
                    if (biaoji == 1 && num > 0) {
                        num--;
                    } else if (biaoji == 0 && num < 25) {
                        num++;
                    } else {
                        if (num == 25) {
                            biaoji = 1;
                        }
                        if (num == 0) {
                            biaoji = 0;
//
                        }

                    }

                }
            }

        }


        for (int i=0 ;i<array.length;i++) {
            array[i] = (char) (allow1[i]+'a');
        }


        return String.valueOf(array);

    }
}
