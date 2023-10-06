package com.example.gio_hang_bao.service;

import com.example.gio_hang_bao.entity.Product;

import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(int id);
}
