package com.example.gio_hang.service;

import com.example.gio_hang.entity.Product2;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product2> findById(int id);
    Iterable<Product2> findAll();
}
