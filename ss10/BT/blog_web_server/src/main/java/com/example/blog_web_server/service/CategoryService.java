package com.example.blog_web_server.service;

import com.example.blog_web_server.entity.Category;


import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category>findAll();
    Optional<Category> findById(int id);
}
