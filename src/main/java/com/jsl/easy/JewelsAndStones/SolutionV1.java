package com.jsl.easy.JewelsAndStones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionV1 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c_j: J.toCharArray()) {
            for (char c_s: S.toCharArray()) {
                if(c_j==c_s) count++;
            }
        }
        return count;
    }

    @Test
    public void test() {
        assertEquals(3, new SolutionV1().numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, new SolutionV1().numJewelsInStones("a", "AA"));
    }
}
