package com.jsl.easy.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap myMap = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }
        for (int j = 0; j < nums.length - 1; j++) {
            int complement = target - nums[j];
            Integer found = (Integer) myMap.get(complement);
            if (found != null && found.intValue() != j) {
                result[0] = j;
                result[1] = found;
                return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] test = {2, 7, 10};
        System.out.println(Arrays.toString(new Solution().twoSum(test, 12)));
    }
}