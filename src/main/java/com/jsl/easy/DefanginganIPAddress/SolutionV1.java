package com.jsl.easy.DefanginganIPAddress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionV1 {
    public String defangIPaddr(String ipAddr) {
        return ipAddr.replace(".", "[.]");
    }

    @Test
    void test() {
        assertEquals("1[.]1[.]1[.]1", new SolutionV1().defangIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", new SolutionV1().defangIPaddr("255.100.50.0"));
    }
}
