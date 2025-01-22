package com.example.baitap.service;

import com.example.baitap.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
    void update(int id,Book book);
    Book findById(int id);
}
