package com.example.casestudy.service.employee.inter;

import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.entity.employee.Division;

import java.util.List;

public interface DivisionService {
    List<Division> findAll();
}
