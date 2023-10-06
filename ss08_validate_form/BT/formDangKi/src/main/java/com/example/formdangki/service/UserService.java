package com.example.formdangki.service;

import com.example.formdangki.entity.User;

import java.util.List;

public interface UserService {
    List<User>findAll();
    void create(User user);
    User findById(String id);
}
