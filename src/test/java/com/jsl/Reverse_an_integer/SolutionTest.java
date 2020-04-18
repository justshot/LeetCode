package com.jsl.Reverse_an_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private int[] input =  {1, 12, 123, 1234, 1000, Integer.MAX_VALUE};
    private long[] output = {1, 21, 321, 4321, 1,    7463847412L};

    @Test
    void Test_reverseInteger() {
        for(int i = 0; i < input.length; i++) {
            assertEquals(output[i], Solution.reverseInteger(input[i]));
        }
    }

    @Test
    void Test_reverseIntegerByArithmetic() {
        for(int i = 0; i < input.length; i++) {
            assertEquals(output[i], Solution.reverseIntegerByArithmetic(input[i]));
        }
    }
}