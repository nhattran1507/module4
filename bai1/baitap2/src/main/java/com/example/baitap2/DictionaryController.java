package com.example.baitap2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String result = dictionaryService.translateWord(word);
        if (result != null) {
            model.addAttribute("word", word);
            model.addAttribute("translation", result);
        } else {
            model.addAttribute("error", "Không tìm thấy từ này trong từ điển!");
        }
        return "result";
    }
}
