package com.example.baitap1;

import com.example.baitap1.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/")
    public String showForm() {
        return "index"; // Điều hướng về trang nhập liệu
    }

    @PostMapping("/")
    public String convert(@RequestParam("rate") String rateStr,
                          @RequestParam("usd") String usdStr,
                          Model model) {

        double rate = validateInput(rateStr, "Rate");
        double usd = validateInput(usdStr, "USD");

        double vnd = currencyService.convertToVnd(rate, usd);
        model.addAttribute("vnd", vnd);
        return "result";
    }

    private double validateInput(String input, String fieldName) {
        double value;
        try {
            value = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(fieldName + " phải là một số hợp lệ.");
        }
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " phải lớn hơn 0.");
        }
        return value;
    }
}
