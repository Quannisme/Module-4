package com.example.muon_sach.service;

import com.example.muon_sach.entity.Book;
import com.example.muon_sach.entity.BookUser;
import com.example.muon_sach.entity.User;
import com.example.muon_sach.repository.BookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookUserServiceImpl implements BookUserService{
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookUserRepository bookUserRepository;

    @Override
    public void borrowBook(int userId, long bookId, int userBookId) {
        User user=userService.findById(userId);
        Book book=bookService.findById(bookId);
        if(book.getQuantity()>0)
        {
            BookUser bookUser=new BookUser(userBookId , book , user);
            bookUserRepository.save(bookUser);
            book.setQuantity(book.getQuantity()-1);
            bookService.update(book);
        }
    }

    @Override
    public void returnBook(int userId, long bookId, int userBookId) {
        User user=userService.findById(userId);
        Book book=bookService.findById(bookId);
        BookUser bookUser=bookUserRepository.findById(userBookId).orElse(null);
        user.getBookUsers().remove(user);
        book.getBookUsers().remove(book);
        bookUserRepository.delete(bookUser);
        BookUser bookUser2=new BookUser(userBookId , book , user);
        bookUserRepository.save(bookUser2);
        book.setQuantity(book.getQuantity()+1);
        bookService.update(book);
    }

    @Override
    public BookUser findById(int userBookId) {
        return bookUserRepository.findById(userBookId).orElse(null);
    }
}
