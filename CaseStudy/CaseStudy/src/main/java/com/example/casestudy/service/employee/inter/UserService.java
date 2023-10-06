package com.example.casestudy.service.employee.inter;

import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.entity.employee.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
