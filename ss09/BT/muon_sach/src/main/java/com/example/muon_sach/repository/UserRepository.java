package com.example.muon_sach.repository;

import com.example.muon_sach.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {
}
