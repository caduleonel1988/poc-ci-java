
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
}
