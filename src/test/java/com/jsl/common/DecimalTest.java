package com.jsl.common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

public class DecimalTest {
    @Test
    public void testFloat() {
        System.out.println("Float: " + 0.3f * 3);
        System.out.println("Double: " + 0.3d * 3);
        BigDecimal x = new BigDecimal("0.3");
        System.out.println("BigDecimal " + x.multiply(new BigDecimal("3")));
    }

    @Test
    public void testPromotionAndDemotion() {
        System.out.println("Float lost precsion after 8 decimal number : " + 1.00000001f);
        System.out.println("Double lost precision after 16 decimal number : " + 1.0000000000000001);
        assertEquals(1.0000000000000001, 1.00000000000000002);
        float f = 1.0000001f;
        double e = f;
        System.out.println("Promotion does lost precision : " + e);
    }

    @Test
    public void testInteger() {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000L;
    }
}
