package com.example.final_module3.repository;

import com.example.final_module3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product>findProductsByNameContainingIgnoreCase(String name);
    List<Product>findProductsByPrice(double price);
    List<Product>findProductsByCategoryId();
}
