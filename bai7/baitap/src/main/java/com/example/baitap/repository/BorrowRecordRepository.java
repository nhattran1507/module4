package com.example.baitap.repository;


import com.example.baitap.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Integer> {
    BorrowRecord findByBorrowCodeAndReturnedFalse(String borrowCode);
}