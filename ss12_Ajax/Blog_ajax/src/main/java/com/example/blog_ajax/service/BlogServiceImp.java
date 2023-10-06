package com.example.blog_ajax.service;


import com.example.blog_ajax.entity.Blog2;
import com.example.blog_ajax.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImp implements BlogService{
    @Autowired
    private BlogRepository blog;
    @Override
    public List<Blog2> findAll() {
        return blog.findAll();
    }

    @Override
    public Optional<Blog2> findById(String id) {
        return blog.findById(id);
    }

    @Override
    public void create(Blog2 blog1) {
        blog.save(blog1);
    }

    @Override
    public void delete(String id) {
        blog.deleteById(id);
    }

    @Override
    public void update(Blog2 blog1) {
        blog.save(blog1);
    }

    @Override
    public List<Blog2> findAllByName(String name) {
        return blog.findAllByNameBlogContaining(name);
    }

    @Override
    public Page<Blog2> findALl(Pageable pageable) {
        return blog.findAll(pageable);
    }

}
