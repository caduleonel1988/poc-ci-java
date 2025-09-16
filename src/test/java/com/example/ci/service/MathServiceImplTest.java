
package com.example.ci.service;

import com.example.ci.service.impl.MathServiceImpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathServiceImplTest {
    private final MathService mathService = new com.example.ci.service.impl.MathServiceImpl();

    @Test
    void testSumPositiveNumbers() {
        assertEquals(5, mathService.sum(2, 3));
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-5, mathService.sum(-2, -3));
    }

    @Test
    void testSumZero() {
        assertEquals(2, mathService.sum(2, 0));
        assertEquals(0, mathService.sum(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, mathService.subtract(3, 2));
        assertEquals(-1, mathService.subtract(2, 3));
        assertEquals(0, mathService.subtract(2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathService.multiply(2, 3));
        assertEquals(0, mathService.multiply(0, 5));
        assertEquals(-6, mathService.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, mathService.divide(6, 3));
        assertEquals(-2, mathService.divide(-6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> mathService.divide(1, 0));
    }
}
