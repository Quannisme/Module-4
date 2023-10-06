package com.example.blog_ajax.repository;


import com.example.blog_ajax.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
