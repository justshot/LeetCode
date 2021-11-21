package com.jsl.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void fib() {
        assertEquals(1, new Fib().fib(0));
        assertEquals(2, new Fib().fib(1));
        assertEquals(3, new Fib().fib(2));
        assertEquals(5, new Fib().fib(3));
        assertEquals(433494437, new Fib().fib(41));
    }
}