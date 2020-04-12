package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import org.junit.jupiter.api.Test;

import static com.jsl.Find_maximum_sum_for_nonadjecent_numbers.SolutionV2.calculateMaximum;
import static org.junit.jupiter.api.Assertions.*;

class SolutionV2Test {

    @Test
    public void Some_array_get_zero(){
        int[] array= new int[]{1, 2};
        assertEquals(2, calculateMaximum(array, array.length - 1));
    }

    @Test
    public void Test_valid_arrays(){
        int[] array= new int[]{1, 2, 3};
        assertEquals(4, calculateMaximum(array, array.length - 1));
        array= new int[]{3, 2, 5, 10, 7};
        assertEquals(15, calculateMaximum(array, array.length - 1));
        array= new int[]{1, 20 ,3};
        assertEquals(20, calculateMaximum(array, array.length - 1));
        array = new int[]{1, 20 ,3, 4, 50};
        assertEquals(70, calculateMaximum(array, array.length - 1));
        array = new int[]{5, 5, 10, 100, 10, 5};
        assertEquals(110, calculateMaximum(array, array.length - 1));
    }
}