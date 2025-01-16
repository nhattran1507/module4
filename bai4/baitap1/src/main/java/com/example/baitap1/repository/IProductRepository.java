package com.example.baitap1.repository;

import com.example.baitap1.model.Product;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    Product findById(Long id);

    boolean save(Product product);

    void delete(Long id);

    List<Product> findByName(String name);
}
