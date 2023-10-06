package com.example.gio_hang_bao.repository;

import com.example.gio_hang_bao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Integer> {
}
