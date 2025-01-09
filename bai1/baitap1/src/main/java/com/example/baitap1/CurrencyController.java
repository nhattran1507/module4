package com.example.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CurrencyController {
    @GetMapping("/")
    public String showForm() {
        return "index"; // Điều hướng về trang nhập liệu
    }

    @PostMapping("/")
    public String convert(@RequestParam("rate") double rate,
                          @RequestParam("usd") double usd,
                          Model model) {
        double vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "result";
    }
}


