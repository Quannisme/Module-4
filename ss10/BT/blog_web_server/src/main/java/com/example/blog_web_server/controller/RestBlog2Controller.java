package com.example.blog_web_server.controller;

import com.example.blog_web_server.entity.Blog2;
import com.example.blog_web_server.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@Controller
@RequestMapping("/api/blog")
public class RestBlog2Controller {
    @Autowired
    private BlogService blogService;

    @GetMapping("")
    public ResponseEntity<List<Blog2>> getAll() {
        List<Blog2> blog2s = blogService.findAll();
        if (blog2s.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog2s, HttpStatus.OK);
    }

    @GetMapping("/searchProduct/{id}")
    public ResponseEntity<Blog2> getFindById(@PathVariable("id") String id) {
        Optional<Blog2> blog2s = blogService.findById(id);
        if (blog2s.isPresent()) {
            return new ResponseEntity<>(blog2s.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<Blog2> getCreate(@RequestBody Blog2 blog2) {
        blogService.create(blog2);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> getDelete(@PathVariable("id") String id)
    {
        Optional<Blog2>blog2=blogService.findById(id);
        if(blog2.isPresent())
        {
            blogService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>getUpdate(@PathVariable("id") String id)
    {
        Optional<Blog2>blog21=blogService.findById(id);
        if(blog21.isPresent())
        {
            blogService.update(blog21.get());
            return new ResponseEntity<>("Update success",HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
