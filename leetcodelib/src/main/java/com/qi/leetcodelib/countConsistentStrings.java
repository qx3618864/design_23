package com.qi.leetcodelib;

import java.util.HashSet;
import java.util.Set;

public class countConsistentStrings {
    public static void main(String[] args) {
        String[] a = {"ad", "bd", "aaab", "baa", "badab"};
        String b = "ab";
        countConsistentStrings(b, a);

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int[] allow = new int[26];
        char[] chars = allowed.toCharArray();
        for (char aChar : chars) {
            allow[aChar - 'a'] = 1;
        }

        int ant = 0;

        for (String word : words) {
            int ant1 = 0;
            String a = removeDuplicatedChars(word);
            char[] ab = word.toCharArray();

            for (char c : ab) {
                if (allow[c - 'a'] != 1) {
                    ant1 = 10;
                    break;
                }
            }
            if (ant1 == 10) {

            } else {

                ant++;
            }

        }


        return ant;
    }

    public static String removeDuplicatedChars(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == i) {
                sb.append(c);
            }
        }
        String result = new String(sb);
        return result;
    }
}
