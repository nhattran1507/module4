package com.example.baitap1;

import com.example.baitap1.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    private final SandwichService sandwichService;

    @Autowired
    public SandwichController(SandwichService sandwichService) {
        this.sandwichService = sandwichService;
    }

    @RequestMapping("/")
    public String showForm() {
        return "condiment-form";
    }

    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiments, Model model) {
        String result = sandwichService.processCondiments(condiments);
        model.addAttribute("selectedCondiments", result);
        return "result";
    }
}
