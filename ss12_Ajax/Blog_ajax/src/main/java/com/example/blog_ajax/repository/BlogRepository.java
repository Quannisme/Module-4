package com.example.blog_ajax.repository;

import com.example.blog_ajax.entity.Blog2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog2, String> {
    //containing : gan dung
    List<Blog2>findAllByNameBlogContaining(String name);
}
