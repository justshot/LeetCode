package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer,Integer> subMax = new HashMap<Integer,Integer>();


    public static int calculateMaximumByRecursion(int[] numbers, int n){
        // stop condition
        if(n == 0) {
            return numbers[0];
        }

        if(n == 1) {
            return Math.max(numbers[0], numbers[1]);
        }

        // recursion
        return Math.max(calculateMaximumByRecursion(numbers, n-2 ) + numbers[n], calculateMaximumByRecursion(numbers, n-1));
    }

    public int calculateMaximumByTopdown(int[] numbers, int n){
        // stop condition
        if(n==0) {
            subMax.put(0,numbers[0]);
        }

        if(n==1) {
            subMax.put(1, Math.max(numbers[0], numbers[1]));
        }


        // recursion
        // check cache
        if(subMax.get(n)==null) {
            int maxForN = Math.max(calculateMaximumByTopdown(numbers, n-2 ) + numbers[n], calculateMaximumByTopdown(numbers, n-1));
            subMax.put(n, maxForN);
            return maxForN;
        } else {
            return subMax.get(n);
        }
    }

    public static int calculateMaximumByBottomup(int[] numbers, int n){
        int prevPrevMax = 0, prevMax = 0, currentMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentMax = Math.max(prevPrevMax + numbers[i], prevMax);
            prevPrevMax = prevMax;
            prevMax = currentMax;
        }
        return currentMax;
    }
}