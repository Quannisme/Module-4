package com.example.final_module3.controller;

import com.example.final_module3.entity.Product;
import com.example.final_module3.service.inter.CategoryServiceInter;
import com.example.final_module3.service.inter.ProductServiceInter;
import com.example.final_module3.util.ProductValidatior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceInter product;
    @Autowired
    private CategoryServiceInter category;
    @Autowired
    private ProductValidatior productValidatior;
    @GetMapping("/listPagging")
    public String viewListProduct(Model model ,
                                   @RequestParam("page") Optional<Integer> page,
                                   @RequestParam("size")Optional<Integer>size,
                                   @RequestParam("sort")Optional<String>sort)
    {
        int currentPage=page.orElse(1);
        int currentSize=size.orElse(4);
        String currentSort=sort.orElse("id");
        Pageable pageable= PageRequest.of(currentPage-1,currentSize, Sort.by(currentSort).ascending());
        Page<Product> products=product.findAll(pageable);
        model.addAttribute("product",products);
        int totalPage = products.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("category",category.findAll());
        return "/product/list";
    }
    @GetMapping("/createProduct")
    public String viewCreate(Model model)
    {
        model.addAttribute("product",new Product());
        model.addAttribute("category", category.findAll());
        return "/product/create";
    }
    @PostMapping("/createProduct")
    public String doCreate(@Validated @ModelAttribute("product") Product product1, BindingResult bindingResult , Model model){
        productValidatior.validate(product1 , bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("category", category.findAll());
            return "/product/create";
        }
        product.createProduct(product1);
        return "redirect:/product/listPagging";
    }
    @GetMapping("/delete")
    public String doDelete(Model model ,@RequestParam("id") int id)
    {
        product.deleteProduct(id);
        return "redirect:/product/listPagging";
    }
}
