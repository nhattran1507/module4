package com.example.baitap1.repository;

import com.example.baitap1.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1L, "Laptop", 1000, "High-performance laptop", "Dell"));
        products.add(new Product(2L, "Smartphone", 500, "Latest model smartphone", "Samsung"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void save(Product product) {
        products.add(product);
    }

    public void update(Long id, Product product) {
        Product existing = findById(id);
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            existing.setDescription(product.getDescription());
            existing.setManufacturer(product.getManufacturer());
        }
    }

    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> searchByName(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}


