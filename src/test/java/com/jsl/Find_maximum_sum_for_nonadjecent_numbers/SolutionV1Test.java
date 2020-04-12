package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.jsl.Find_maximum_sum_for_nonadjecent_numbers.SolutionV1.calculateMaximum;
import org.junit.jupiter.api.Test;

public class SolutionV1Test {
    @Test
    public void Some_array_get_zero(){
        assertEquals(0, calculateMaximum(new int[]{1, 2}));
    }

    @Test
    public void Test_valid_arrays(){
        assertEquals(4, calculateMaximum(new int[]{1, 2, 3}));
        assertEquals(15, calculateMaximum(new int[]{3, 2, 5, 10, 7}));
        assertEquals(20, calculateMaximum(new int[]{1, 20 ,3}));
        assertEquals(70, calculateMaximum(new int[]{1, 20 ,3, 4, 50}));
        assertEquals(110, calculateMaximum(new int[]{5, 5, 10, 100, 10, 5}));
    }
}