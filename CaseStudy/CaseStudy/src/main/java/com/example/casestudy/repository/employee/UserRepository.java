package com.example.casestudy.repository.employee;

import com.example.casestudy.entity.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
