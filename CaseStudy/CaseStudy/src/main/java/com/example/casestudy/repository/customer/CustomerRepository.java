package com.example.casestudy.repository.customer;

import com.example.casestudy.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {
    //containing no la gan dung
//    List<Customer>findByNameContainingIgnoreCaseOrPhoneContainingIgnoreCase(String name , String phone);
    List<Customer>findCustomersByNameContainingIgnoreCaseOrPhoneContainingIgnoreCase(String name , String phone);
}
