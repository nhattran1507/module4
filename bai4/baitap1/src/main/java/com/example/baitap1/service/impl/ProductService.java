package com.example.baitap1.service.impl;

import com.example.baitap1.model.Product;
import com.example.baitap1.repository.IProductRepository;
import com.example.baitap1.repository.ProductRepository;
import com.example.baitap1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);
    }
    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
