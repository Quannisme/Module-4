package com.example.gio_hang.service;

import com.example.gio_hang.entity.Product2;
import com.example.gio_hang.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Optional<Product2> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Iterable<Product2> findAll() {
        return productRepository.findAll();
    }
}
