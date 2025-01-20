package com.example.blog.service.impl;

import com.example.blog.entity.Category;
import com.example.blog.repository.ICategoryRepository;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public void update(Category category) {
        if (category.getIdCategory() != null && categoryRepository.existsById(category.getIdCategory())) {
            categoryRepository.save(category);
        } else {
            throw new IllegalArgumentException("Danh mục không tồn tại để cập nhật.");
        }
    }

    @Override
    public Category getById(int id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        return optionalCategory.orElseThrow(() -> new IllegalArgumentException("Không tìm thấy danh mục với ID: " + id));
    }
}
