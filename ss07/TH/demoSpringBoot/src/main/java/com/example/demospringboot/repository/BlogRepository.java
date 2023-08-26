package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Blog2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog2, String> {
}
