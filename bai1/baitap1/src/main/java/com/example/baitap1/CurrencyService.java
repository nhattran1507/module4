package com.example.baitap1.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    public double convertToVnd(double rate, double usd) {
        return rate * usd;
    }
}
