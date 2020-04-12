package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import org.junit.jupiter.api.Test;

import static com.jsl.Find_maximum_sum_for_nonadjecent_numbers.SolutionV3.calculateMaximum;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionV3Test {

    @Test
    public void Some_array_get_zero(){
        int[] array= new int[]{1, 2};
        assertEquals(2, calculateMaximum(array, array.length - 1));
    }

    @Test
    public void Test_valid_arrays(){
        int[] array= new int[]{1, 2, 3};
        assertEquals(0, calculateMaximum(array, array.length - 1));
        array= new int[]{3, 2, 5, 10, 7};
        assertEquals(0, calculateMaximum(array, array.length - 1));
        array= new int[]{1, 20 ,3};
        assertEquals(0, calculateMaximum(array, array.length - 1));
        array = new int[]{1, 20 ,3, 4, 50};
        assertEquals(0, calculateMaximum(array, array.length - 1));
        array = new int[]{5, 5, 10, 100, 10, 5};
        assertEquals(0, calculateMaximum(array, array.length - 1));
    }
}