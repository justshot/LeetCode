package com.jsl.Find_maximum_sum_for_nonadjecent_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void Empty_array_get_zero(){
        int actual = Solution.calculateMaximum(new int[0]);
        assertEquals(0, actual);
    }
}