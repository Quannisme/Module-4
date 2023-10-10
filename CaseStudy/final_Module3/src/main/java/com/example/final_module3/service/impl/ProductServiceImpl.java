package com.example.final_module3.service.impl;

import com.example.final_module3.entity.Product;
import com.example.final_module3.repository.ProductRepository;
import com.example.final_module3.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServiceInter{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findProductsByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Product> findByPrice(double price) {
        return productRepository.findProductsByPrice(price);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
