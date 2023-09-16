package com.example.gio_hang.repository;

import com.example.gio_hang.entity.Product2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product2 ,Integer > {
}
