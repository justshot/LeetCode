package com.jsl.common;

import org.junit.jupiter.api.Test;

public class DecimalTest {
    @Test
    public static void testFloat() {
        System.out.println("testWithFloats\n");
        float a = 0.1f;
        float b = 0.1f;
        float c = 0.1f;

        float d = a + b + c;
        float e = d * 3;
        float f = d * 100000;

        System.out.println("a + b + c = d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
