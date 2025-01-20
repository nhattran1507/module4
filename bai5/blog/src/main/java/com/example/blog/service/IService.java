package com.example.blog.service;

import java.util.List;

public interface IService<T>  {
    List<T> getAll();
    void save(T t);
    void remove(T t);
    void update(T t);
    T getById(int id);

}
