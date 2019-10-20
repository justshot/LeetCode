package com.jsl.easy.minimumMovestoEqualArrayElements;

import java.util.Arrays;

/**
 * Created by shaoliang.
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/?tab=Description
 */
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int result = 0;
        int min = nums[0];
        for (int n:nums){
            min = Math.min(min, n);
        }
        for(int n:nums){
            result = result + n - min;
        }
        return result;
    }

}
