package com.example.blog_ajax.service;


import com.example.blog_ajax.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category>findAll();
    Optional<Category> findById(int id);
}
