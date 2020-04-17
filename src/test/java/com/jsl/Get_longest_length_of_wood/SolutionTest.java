package com.jsl.Get_longest_length_of_wood;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void TestScenarios() {
        //no need cut
        int[] L = {5, 9, 7};
        int k = 3;
        int expected = 5;


        L = new int[]{5, 9, 7};
        k = 4;
        expected = 4;

        L = new int[]{1, 2, 3};
        k = 7;
        expected = 0;

        L = new int[]{232, 124, 456};
        k = 7;
        expected = 114;
    }

}