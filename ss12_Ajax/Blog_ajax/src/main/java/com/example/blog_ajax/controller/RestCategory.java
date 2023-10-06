package com.example.blog_ajax.controller;

import com.example.blog_ajax.entity.Category;
import com.example.blog_ajax.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/category")
public class RestCategory {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public ResponseEntity<?>getFindAll()
    {
        List<Category> category=categoryService.findAll();
        if (category.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findCategory/{id}")
    public ResponseEntity<?>getFindCategory(@PathVariable("id") int id)
    {
        Optional<Category>category=categoryService.findById(id);
        if(category.isPresent())
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
