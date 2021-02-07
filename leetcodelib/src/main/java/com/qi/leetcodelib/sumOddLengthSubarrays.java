package com.qi.leetcodelib;

public class sumOddLengthSubarrays {
    public static void main(String[] args) {

    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int total = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                total++;
            }
        }
        return total;
    }

}
