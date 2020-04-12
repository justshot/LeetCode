package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

public class SolutionV3 {
    public static int calculateMaximum(int[] numbers, int n){
        int maxValue = 0;
        // stop condition
        if(n == 0) {
            return numbers[0];
        }

        if(n == 1) {
            return Math.max(numbers[0], numbers[1]);
        }

        // recursion
        Math.max(calculateMaximum(numbers, n-2 ) + numbers[n], calculateMaximum(numbers, n-1));
        return maxValue;
    }

}