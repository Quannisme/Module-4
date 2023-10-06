package com.example.casestudy.service.customer.inter;

import com.example.casestudy.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    void create(Customer customer);
    List<Customer>findAll();
    void delete(int id);
    Customer findById(int id);
    void update(Customer customer);
    List<Customer>findByNameOrPhone(String index);
    Page<Customer>findAll(Pageable pageable);
}
