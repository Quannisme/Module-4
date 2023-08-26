package com.example.demospringboot.service;

import com.example.demospringboot.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category>findAll();
    Category findById(int id);
}
