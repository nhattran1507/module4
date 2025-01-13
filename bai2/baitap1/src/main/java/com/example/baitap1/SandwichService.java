package com.example.baitap1;

import org.springframework.stereotype.Service;

@Service
public class SandwichService {
    public String processCondiments(String[] condiments) {
        if (condiments != null && condiments.length > 0) {
            return String.join(", ", condiments);
        }
        return "Không có gia vị nào được chọn.";
    }
}
