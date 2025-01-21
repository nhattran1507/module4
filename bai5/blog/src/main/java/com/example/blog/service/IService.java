package com.example.blog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IService<T>  {
    Page<T> getAll(Pageable pageable);
    void save(T t);
    void remove(T t);
    void update(T t);
    T getById(int id);

}
