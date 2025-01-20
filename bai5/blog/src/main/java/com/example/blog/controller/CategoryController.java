package com.example.blog.controller;

import com.example.blog.entity.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @PostMapping
    public String createCategory(@RequestBody Category category) {
        categoryService.save(category);
        return "Danh mục đã được tạo thành công.";
    }

    @PutMapping("/{id}")
    public String updateCategory(@PathVariable int id, @RequestBody Category category) {
        category.setIdCategory(id);
        categoryService.update(category);
        return "Danh mục đã được cập nhật thành công.";
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable int id) {
        Category category = categoryService.getById(id);
        categoryService.remove(category);
        return "Danh mục đã được xóa thành công.";
    }
}
