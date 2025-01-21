package com.example.baitap1.repository;

import com.example.baitap1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<User, Integer> {
}
