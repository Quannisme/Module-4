package com.example.demospringboot.service;

import com.example.demospringboot.entity.Category;
import com.example.demospringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    private CategoryRepository category;
    @Override
    public List<Category> findAll() {
        return category.findAll();
    }

    @Override
    public Category findById(int id) {
        return category.findById(id).orElse(null);
    }
}
