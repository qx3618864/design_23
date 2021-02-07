package com.qi.leetcodelib;

public class pivotIndex {
    public static void main(String[] args) {
        int [] a = {1, 7, 3, 6, 5, 6};
        pivotIndex(a);
    }

    public static int pivotIndex(int[] nums) {
        int  total = 0;
        int  total1 = 0;
        int a = -1;
        if(nums.length==0){
            return -1;
        }
        for (int num : nums) {
            total +=num;
        }
        if(total -nums[0]==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            total1+=nums[i];
            if(i+1 ==nums.length){
                a =-1;
                return -1;
            }
            if(total1 ==total-total1-nums[i+1]){
                a =i+1;
                return  i+1;
            }
        }
        if(total-nums[nums.length-1]==0){
            return nums.length-1;
        }
        return  a;

    }
}
