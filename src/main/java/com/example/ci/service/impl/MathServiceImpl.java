package com.example.ci.service.impl;

import com.example.ci.service.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
