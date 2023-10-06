package com.example.blog_ajax.controller;

import com.example.blog_ajax.entity.Blog2;
import com.example.blog_ajax.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    @GetMapping("/search")
    public ResponseEntity<?> getFindByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(blogService.findAllByName(name), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Blog2> getCreate(@RequestBody Blog2 blog2) {
        blogService.create(blog2);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> getDelete(@PathVariable("id") String id) {
        Optional<Blog2> blog2 = blogService.findById(id);
        if (blog2.isPresent()) {
            blogService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> getUpdate(@PathVariable("id") String id) {
        Optional<Blog2> blog21 = blogService.findById(id);
        if (blog21.isPresent()) {
            blogService.update(blog21.get());
            return new ResponseEntity<>("Update success", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/LoadPagging")
    public ResponseEntity<?> viewLoadListPaging(Model model,
                                                @RequestParam("page") Optional<Integer> page,
                                                @RequestParam("size") Optional<Integer> size,
                                                @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int currentSize = size.orElse(3);
        String currentSort = sort.orElse("datePublish");
        Pageable pageable = PageRequest.of(currentPage - 1, currentSize, Sort.by(currentSort).descending());
        Page<Blog2> blog2s = blogService.findALl(pageable);
        return new ResponseEntity<>(blog2s, HttpStatus.OK);
    }
}
