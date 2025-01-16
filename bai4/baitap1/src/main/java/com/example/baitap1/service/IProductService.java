package com.example.baitap1.service;

import com.example.baitap1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    void save(Product product);

}
