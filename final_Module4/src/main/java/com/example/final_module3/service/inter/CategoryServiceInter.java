package com.example.final_module3.service.inter;

import com.example.final_module3.entity.Category;

import java.util.List;

public interface CategoryServiceInter {
    List<Category>findAll();
    Category findById(int id);
}
