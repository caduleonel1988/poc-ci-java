
package com.example.ci.service;

import com.example.ci.service.impl.SumServiceImpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumServiceImplTest {
    private final SumService sumService = new com.example.ci.service.impl.SumServiceImpl();

    @Test
    void testSumPositiveNumbers() {
        assertEquals(5, sumService.sum(2, 3));
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-5, sumService.sum(-2, -3));
    }

    @Test
    void testSumZero() {
        assertEquals(2, sumService.sum(2, 0));
        assertEquals(0, sumService.sum(0, 0));
    }
}
