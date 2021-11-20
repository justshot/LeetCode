package com.jsl.easy.romantointeger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testAddOnly() {
        assertEquals(3, Solution.romanToInt("III"));
        assertEquals(58, Solution.romanToInt("LVIII"));
    }

    @Test
    public void testSubtractOnly() {
        assertEquals(4, Solution.romanToInt("IV"));
        assertEquals(9, Solution.romanToInt("IX"));
    }

    @Test
    public void testMixed() {
        assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }

}