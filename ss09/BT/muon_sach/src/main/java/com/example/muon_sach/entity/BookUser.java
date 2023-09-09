package com.example.muon_sach.entity;

import javax.persistence.*;

@Entity
public class BookUser {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_book")
    Book book;

    @ManyToOne
    @JoinColumn(name = "id_user")
    User user;

    public BookUser() {
    }

    public BookUser(int id, Book book, User user) {
        this.id = id;
        this.book = book;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
