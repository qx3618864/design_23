package com.qi.leetcodelib;

public class numIdenticalPairs {
    public static void main(String[] args) {

        int[] nums = new int[]{ 1,2,3,1,1,3};


        numIdenticalPairs(nums);
    }

    public static int numIdenticalPairs(int[] nums) {
        int ant = 0;
        int[] tmpe = new int[100];


        for(int num:nums){
            ant+=tmpe[num-1];
            tmpe[num-1]++; // 在有相同的数值的时候就+1

        }
        return ant;
    }

}
