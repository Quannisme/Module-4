package com.example.muon_sach.Service;

import com.example.muon_sach.entity.BookUser;

public interface BookUserService {
    void borrowBook(int userId , long bookId , int userBookId);
    void returnBook(int userId , long bookId , int userBookId);
    BookUser findById(int userBookId);
}
