package com.qi.leetcodelib;

public class maximumWealth {
    public static void main(String[] args) {
        System.out.println(11111111);
        int [][] accounts;
        accounts =  new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        maximumWealth1(accounts);
    }



    public static int maximumWealth1(int[][] accounts) {
        int Max = 0;
        for (int i=0;i<accounts.length;i++) {
                int pretty = 0;
            for(int j= 0;j<accounts[i].length;j++){
                pretty+= accounts[i][j];
                Max = Math.max(Max,pretty);

            }
        }

        return  Max;

    }

}
