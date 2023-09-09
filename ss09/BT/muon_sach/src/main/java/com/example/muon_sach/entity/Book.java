package com.example.muon_sach.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long idBook;
    @NotNull
    private String name;
    private int quantity;
    @OneToMany(mappedBy = "book")
    Set<BookUser>bookUsers;
    public Book() {
    }

    public Book(long id, String name, int quantity) {
        this.idBook = id;
        this.name = name;
        this.quantity = quantity;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long id) {
        this.idBook = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<BookUser> getBookUsers() {
        return bookUsers;
    }

    public void setBookUsers(Set<BookUser> bookUsers) {
        this.bookUsers = bookUsers;
    }
}
