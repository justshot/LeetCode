package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import org.junit.jupiter.api.Test;

import static com.jsl.Find_maximum_sum_for_nonadjecent_numbers.Solution.calculateMaximumByRecursion;
import static com.jsl.Find_maximum_sum_for_nonadjecent_numbers.Solution.calculateMaximumByBottomup;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final int[][] testData = {
            {1, 2},
            {1, 2, 3},
            {3, 2, 5, 10, 7},
            {1, 20 ,3},
            {1, 20 ,3, 4, 50},
            {5, 5, 10, 100, 10, 5}
    };

    private final int[] expectedResult = {
            2,
            4,
            15,
            20,
            70,
            110
    };

    @Test
    public void Test_calculateMaximumByRecursion(){
        for(int i=0; i< testData.length; i++) {
            assertEquals(expectedResult[i], calculateMaximumByRecursion(testData[i], testData[i].length - 1));
        }
    }

    @Test
    public void Test_calculateMaximumByTopdown(){
        for(int i=0; i< testData.length; i++) {
            assertEquals(expectedResult[i], new Solution().calculateMaximumByTopdown(testData[i], testData[i].length - 1));
        }
    }

    @Test
    public void Test_calculateMaximumByBottomup(){
        for(int i=0; i< testData.length; i++) {
            assertEquals(expectedResult[i], calculateMaximumByBottomup(testData[i], testData[i].length - 1));
        }
    }
}