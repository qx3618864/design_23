package com.qi.leetcodelib;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int chizi=0;
        List<Boolean> list = new ArrayList<Boolean>();
        for (int candy : candies) {
            if(candy>chizi){
                chizi=candy;
            }
        }

        for (int candy : candies) {
            if(candy+extraCandies>=chizi){
                list.add(true);
            }else {
                list.add(false);

            }
        }
        return  list;

    }
}
