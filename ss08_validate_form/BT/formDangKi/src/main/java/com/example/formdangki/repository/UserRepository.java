package com.example.formdangki.repository;

import com.example.formdangki.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {

}
