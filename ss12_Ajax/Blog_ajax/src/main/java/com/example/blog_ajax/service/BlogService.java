package com.example.blog_ajax.service;

import com.example.blog_ajax.entity.Blog2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog2>findAll();
    Optional<Blog2>findById(String id);
    List<Blog2>findAllByName(String name);
    void create(Blog2 blog);
    void delete(String id);
    void update(Blog2 blog);
    Page<Blog2> findALl(Pageable pageable);
}
