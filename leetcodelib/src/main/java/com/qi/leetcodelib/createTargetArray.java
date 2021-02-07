package com.qi.leetcodelib;


import java.util.ArrayList;
import java.util.List;

public class createTargetArray {
    public static void main(String[] args) {
     int [] a =  {4,2,4,3,2};
         int [] b = {0,0,1,3,1};
        createTargetArray (a,b);
//        [2,2,0,1,0]
//         [2,4,0,5,0]
    }


    public static int[] createTargetArray(int[] nums, int[] index) {
        int []  biaoji = new int [index.length] ;//  作用就是为了 每个同样的数出了几遍+
        int []  biaojitotal = new int [index.length] ;//  选出来每个数据的坐标
        int total = 0;

        List list = new ArrayList();
        int []  lianxiang1 = new int [index.length] ;

        for(int i=0;i<index.length;i++){
            if(list.size()>index[i]){

                list.add(index[i], nums[i]);
            }else{
                list.add( nums[i]);
            }
        }
        for(int i = 0; i < list.size(); i++){
            lianxiang1[i]= (int) list.get(i);
        }

        return lianxiang1;
        
        

    }
}
