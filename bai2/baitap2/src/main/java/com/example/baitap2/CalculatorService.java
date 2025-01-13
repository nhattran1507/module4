package com.example.baitap2;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, double num2, String operator) throws IllegalArgumentException {
        switch (operator) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Không thể chia cho 0!");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Phép tính không hợp lệ!");
        }
    }
}
