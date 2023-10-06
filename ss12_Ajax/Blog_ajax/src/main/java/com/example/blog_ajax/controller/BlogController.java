package com.example.blog_ajax.controller;

import com.example.blog_ajax.entity.Blog2;
import com.example.blog_ajax.service.BlogService;
import com.example.blog_ajax.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blog;
    @Autowired
    private CategoryService category;
    @GetMapping("/")
    public String viewList(Model model)
    {
        model.addAttribute("blog",blog.findAll());
        return "blog/List";
    }
    @PostMapping("/search")
    public String doSearch(Model model,@RequestParam("search") String id)
    {
        model.addAttribute("blogs",blog.findById(id));
        return "blog/Detail";
    }
    @GetMapping("/create")
    public String viewCreate(Model model)
    {
        model.addAttribute("blog" , new Blog2());
        model.addAttribute("categorys" , category.findAll());
        return "blog/create";
    }
    @PostMapping("/create")
    public String doCreate(Model model , @ModelAttribute("blog") Blog2 blog1)
    {
        blog.create(blog1);
        return "redirect:/blog/Pagging";
    }
    @GetMapping("/Pagging")
    public String viewListPaging(Model model,
                                 @RequestParam("page")Optional<Integer>page,
                                 @RequestParam("size")Optional<Integer>size,
                                 @RequestParam("sort")Optional<String>sort)
    {
        int currentPage=page.orElse(1);
        int currentSize=size.orElse(3);
        String currentSort=sort.orElse("datePublish");
        Pageable pageable= PageRequest.of(currentPage-1,currentSize, Sort.by(currentSort).descending());
        Page<Blog2>blog2s=blog.findALl(pageable);
        model.addAttribute("blog",blog2s);
        int totalPage = blog2s.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "/blog/Pagging";
    }
    @GetMapping("/LoadPagging")
    public String viewLoadListPaging(Model model,
                                 @RequestParam("page")Optional<Integer>page,
                                 @RequestParam("size")Optional<Integer>size,
                                 @RequestParam("sort")Optional<String>sort)
    {
        int currentPage=page.orElse(1);
        int currentSize=size.orElse(3);
        String currentSort=sort.orElse("datePublish");
        Pageable pageable= PageRequest.of(currentPage-1,currentSize, Sort.by(currentSort).descending());
        Page<Blog2>blog2s=blog.findALl(pageable);
        model.addAttribute("blog",blog2s);
        int totalPage = blog2s.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "/blog/loadPagging";
    }
    @GetMapping("/delete")
    public String doDelete(Model model, @RequestParam("id") String id)
    {
        blog.delete(id);
        return "redirect:/blog/";
    }
    @GetMapping("/Edit")
    public String viewEdit(Model model , @RequestParam("id") String id)
    {
        model.addAttribute("blog3", blog.findById(id));
        model.addAttribute("categoryss",category.findAll());
        return "blog/Edit";
    }
    @PostMapping("/Edit")
    public String doEdit(@ModelAttribute("blog3") Blog2 blog2)
    {
        blog.update(blog2);
        return "redirect:/blog/";
    }
}
