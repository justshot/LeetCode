package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

public class SolutionV1 {
    public static int calculateMaximum(int[] numbers){
        int maxValue = 0;
        if(numbers.length < 3) {
            return maxValue;
        }

        for(int i=0; i< numbers.length; i++){
            int sum = numbers[i];
            for (int j=i+2; j< numbers.length; j=j+2) {
                sum += numbers[j];
            }
            if(sum > maxValue) maxValue = sum;
        }
        return maxValue;
    }

}