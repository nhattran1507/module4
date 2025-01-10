package com.example.baitap2;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("car", "ô tô");
        dictionary.put("minhnhat", "Đẹp trai");
        dictionary.put("spring", "mùa xuân hoặc Spring Framework");
    }

    public String findTranslation(String word) {
        return dictionary.get(word.toLowerCase());
    }
}
