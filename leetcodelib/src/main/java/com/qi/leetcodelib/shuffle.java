package com.qi.leetcodelib;

public class shuffle {
    public static void main(String[] args) {
        int[]a={2,5,1,3,4,7};
        shuffle1(a,3);
    }

    public static int[] shuffle1(int[] nums, int n) {
        int[] total = new int[2*n];


        for (int i=0;i<nums.length;i++) {
            if(i%2==0){

                total[i]=nums[i/2];
            }else{
                total[i]=nums[n+i/2];
            }


            
        }
        
        return  total;
    }

}
