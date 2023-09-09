package com.example.muon_sach.repository;

import com.example.muon_sach.entity.BookUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookUserRepository extends JpaRepository<BookUser , Integer> {
}
