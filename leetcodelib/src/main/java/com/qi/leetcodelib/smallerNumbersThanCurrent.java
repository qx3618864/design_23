package com.qi.leetcodelib;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int [] a ={8,1,2,2,3};
        smallerNumbersThanCurrent(a);
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] total = new  int[101];
        int[] xinint = new  int[nums.length];
        int tongji = 0;

        for (int num : nums) {
            total[num]++;
        }

        int[] lenggth = new  int[nums.length];
        for(int i=0;i<nums.length;i++){

            for(int a =  0;a<nums[i];a++){
                if(total[a]!=0){

                    tongji =tongji +total[a];
                }
            }
            xinint[i] = tongji;
            tongji = 0;



        }
        return  xinint;

    }
}
