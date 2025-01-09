package com.example.baitap2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("car", "ô tô");
        dictionary.put("minhnhat", "Đẹp trai");
        dictionary.put("spring", "mùa xuân hoặc Spring Framework");
    }

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionary.get(word.toLowerCase());
        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("translation", result);
        } else {
            model.addAttribute("error", "Không tìm thấy từ này trong từ điển!");
        }
        return "result";
    }
}