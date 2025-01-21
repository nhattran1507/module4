package com.example.baitap1.service;

import com.example.baitap1.entity.User;
import com.example.baitap1.repository.UserReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserReposiroty userReposiroty;

    @Override
    public void save(User user) {
        userReposiroty.save(user);
    }
}
