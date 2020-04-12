package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

public class SolutionV2 {
    public static int calculateMaximum(int[] numbers, int n){
        // stop condition
        if(n == 0) {
            return numbers[0];
        }

        if(n == 1) {
            return Math.max(numbers[0], numbers[1]);
        }

        // recursion
        return Math.max(calculateMaximum(numbers, n-2 ) + numbers[n], calculateMaximum(numbers, n-1));
    }

}