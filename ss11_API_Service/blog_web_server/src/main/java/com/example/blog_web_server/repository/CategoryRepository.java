package com.example.blog_web_server.repository;

import com.example.blog_web_server.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
