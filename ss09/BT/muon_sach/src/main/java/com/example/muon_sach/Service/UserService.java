package com.example.muon_sach.Service;

import com.example.muon_sach.entity.User;

import java.util.List;

public interface UserService {
    List<User>findAll();
    User findById(int id);
}
