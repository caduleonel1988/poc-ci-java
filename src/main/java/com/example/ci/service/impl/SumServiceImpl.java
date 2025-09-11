package com.example.ci.service.impl;

import com.example.ci.service.SumService;
import org.springframework.stereotype.Service;

@Service
public class SumServiceImpl implements SumService {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
