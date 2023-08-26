package com.example.demospringboot.service;

import com.example.demospringboot.entity.Blog2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog2>findAll();
    Blog2 findById(String id);
    void create(Blog2 blog);
    void delete(String id);
    void update(Blog2 blog);
    Page<Blog2> findALl(Pageable pageable);
}
