package com.example.casestudy.repository.customer;

import com.example.casestudy.entity.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType , Integer> {
}
