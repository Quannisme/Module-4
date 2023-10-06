package com.example.casestudy.service.customer.inter;

import com.example.casestudy.entity.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType>findAll();
    CustomerType findById(int id);
}
