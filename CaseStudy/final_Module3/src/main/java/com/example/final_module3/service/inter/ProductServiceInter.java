package com.example.final_module3.service.inter;

import com.example.final_module3.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductServiceInter {
    List<Product>findAll();
    void deleteProduct(int id);
    void createProduct(Product product);
    List<Product> findByName(String name);
    List<Product> findByPrice(double price);
    Page<Product> findAll(Pageable pageable);
}
