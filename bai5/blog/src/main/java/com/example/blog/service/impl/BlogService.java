package com.example.blog.service.impl;

import com.example.blog.entity.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> getAll() {

        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {

        blogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {

        blogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        if (blog.getId() != null && blogRepository.existsById(blog.getId())) {
            blogRepository.save(blog);
        } else {
            throw new IllegalArgumentException("Blog không tồn tại để cập nhật.");
        }
    }

    @Override
    public Blog getById(int id) {
        Optional<Blog> optionalBlog = blogRepository.findById(id);
        return optionalBlog.orElseThrow(() -> new IllegalArgumentException("Không tìm thấy blog với ID: " + id));
    }
}
