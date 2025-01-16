package com.example.baitap1.repository;

import com.example.baitap1.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("from Product", Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(Long id) {
        Product product = entityManager.find(Product.class, id);
        if (product == null) {
            throw new RuntimeException("Product not found");
        }
        return product;
    }


    @Transactional
    @Override
    public boolean save(Product product) {
        try {
            entityManager.persist(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Transactional
    @Override
    public void delete(Long id) {
        Product product = findById(id);
        if (product != null) {
            entityManager.remove(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query = entityManager.createQuery(
                "SELECT p FROM Product p WHERE p.name LIKE :name", Product.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }
}