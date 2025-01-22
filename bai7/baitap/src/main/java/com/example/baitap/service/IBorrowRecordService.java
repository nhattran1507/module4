package com.example.baitap.service;

import com.example.baitap.model.BorrowRecord;

import java.util.List;

public interface IBorrowRecordService {
    List<BorrowRecord> getAll();
    void save(BorrowRecord blog);
    void update(int id, BorrowRecord blog);
    void remove(int id);
    BorrowRecord findById(int id);
    BorrowRecord findByBorrowCodeAndReturnedFalse(String borrowCode);
    String borrowBook(Integer bookId);
    void returnBook(String borrowCode);
}
