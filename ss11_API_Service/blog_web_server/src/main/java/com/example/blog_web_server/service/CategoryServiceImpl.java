package com.example.blog_web_server.service;

import com.example.blog_web_server.entity.Category;
import com.example.blog_web_server.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    private CategoryRepository category;
    @Override
    public List<Category> findAll() {
        return category.findAll();
    }

    @Override
    public Optional<Category> findById(int id) {
        return category.findById(id);
    }
}
