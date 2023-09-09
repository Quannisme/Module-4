package com.example.muon_sach.Service;

import com.example.muon_sach.entity.Book;
import com.example.muon_sach.entity.User;
import com.example.muon_sach.repository.BookRepository;
import com.example.muon_sach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
    //
//    @Override
//    public void borrowBook(int userId, long bookId) {
//        User user=userRepository.findById(userId).orElse(null);
//        Book book=bookRepository.findById(bookId).orElse(null);
//        if(book.getQuantity()>0)
//        {
//            user.getBooks().add(book);
//            book.getUsers().add(user);
//            userRepository.save(user);
//            bookRepository.save(book);
//            book.setQuantity(book.getQuantity()-1);
//        }
//    }
//
//    @Override
//    public void returnBook(int userId, long bookId) {
//        User user=userRepository.findById(userId).orElse(null);
//        Book book=bookRepository.findById(bookId).orElse(null);
//        user.getBooks().remove(book);
//        book.getUsers().remove(user);
//        userRepository.save(user);
//        bookRepository.save(book);
//        book.setQuantity(book.getQuantity()+1);
//    }
}
