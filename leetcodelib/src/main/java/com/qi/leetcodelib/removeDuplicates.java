package com.qi.leetcodelib;

public class removeDuplicates {
    public static void main(String[] args) {
        System.out.println(1111111111);

    }

    /*
    注释1 注意审题 这是一个有序的数组  所有在去重的时候只需要逐一前后比对就可以
    2  当相等的时候i++ j 不变
    */

    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                    j++;
                nums[j] = nums[i];
            }
        }
        return j+1;

    }

}
