package com.example.gio_hang.controller;

import com.example.gio_hang.entity.Cart;
import com.example.gio_hang.entity.Product2;
import com.example.gio_hang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart")
public class Product2Controller {
    @Autowired
    ProductService productService;
    @ModelAttribute("cart")
    public Cart init() {
        return new Cart();
    }
    @GetMapping("")
    public String viewShop(Model model)
    {
        model.addAttribute("products",productService.findAll());
        return "/list";
    }
    @GetMapping("/detail/{id}")
    public String viewDetail(  Model model, @PathVariable int id)
    {
        Optional<Product2> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            model.addAttribute("product",productOptional.get());
        }else {
            model.addAttribute("product", null);
        }
        return "/detail";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id, @SessionAttribute("cart") Cart cart){
        Optional<Product2> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            cart.deleteProduct(productOptional.get());
        }
        return "redirect:/cart";
    }
    @GetMapping("/change")
    public String changeQuantity(@SessionAttribute("cart") Cart cart, Model model, @RequestParam("id") int id, @RequestParam("newQuantity") int newQuantity){
        Optional<Product2> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            cart.changeQuantity(productOptional.get(), newQuantity);
            model.addAttribute("product",productOptional.get());
        }
        return "redirect:/cart";
    }
    @GetMapping("/add/{id}")
    public String addProduct(@PathVariable int id, @SessionAttribute("cart") Cart cart){
        Optional<Product2> productOptional = productService.findById(id);
        if (productOptional.isPresent()){
            cart.addProduct(productOptional.get());
        }
        return "redirect:/cart";
    }
}
