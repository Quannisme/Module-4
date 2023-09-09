package com.example.muon_sach.repository;

import com.example.muon_sach.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book , Long> {
}
