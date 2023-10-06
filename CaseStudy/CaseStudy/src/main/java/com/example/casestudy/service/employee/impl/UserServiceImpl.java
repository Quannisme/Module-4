package com.example.casestudy.service.employee.impl;

import com.example.casestudy.entity.employee.User;
import com.example.casestudy.repository.employee.UserRepository;
import com.example.casestudy.service.employee.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
