package com.jsl.easy.JewelsAndStones;

import com.jsl.easy.DefanginganIPAddress.SolutionV1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionV1Test {

    @Test
    public void test() {
        assertEquals(3, new com.jsl.easy.JewelsAndStones.SolutionV1().numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, new com.jsl.easy.JewelsAndStones.SolutionV1().numJewelsInStones("a", "AA"));
    }
}