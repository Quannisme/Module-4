package com.example.muon_sach.service;

import com.example.muon_sach.entity.Book;

import java.util.List;

public interface BookService {
//    void borrowBook(int userId , long bookId);
//    void returnBook(int userId , long bookId);
    List<Book>findAll();
    Book findById(long id);
    void update(Book book);

}
