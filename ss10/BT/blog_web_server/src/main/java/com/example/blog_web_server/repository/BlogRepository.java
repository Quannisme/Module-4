package com.example.blog_web_server.repository;

import com.example.blog_web_server.entity.Blog2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog2, String> {
}
