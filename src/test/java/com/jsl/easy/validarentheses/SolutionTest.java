package com.jsl.easy.validarentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid_True() {
        assertEquals(true, new Solution().isValid("()"));
        assertEquals(true, new Solution().isValid("()[]{}"));
        assertEquals(true, new Solution().isValid("{[]}"));
    }

    @Test
    void isValid_False() {
        assertEquals(false, new Solution().isValid("("));
        assertEquals(false, new Solution().isValid("]"));
        assertEquals(false, new Solution().isValid("(]"));
        assertEquals(false, new Solution().isValid("([)]"));
    }
}