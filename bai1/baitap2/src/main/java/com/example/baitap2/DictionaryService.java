package com.example.baitap2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    @Autowired
    private DictionaryRepository dictionaryRepository;

    public String translateWord(String word) {
        return dictionaryRepository.findTranslation(word);
    }
}
