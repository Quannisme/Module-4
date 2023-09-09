package com.example.muon_sach.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private int idUser;
    private String name;
    @OneToMany(mappedBy = "user")
    Set<BookUser>bookUsers;
    public User() {
    }

    public User(int id, String name) {
        this.idUser = id;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int id) {
        this.idUser = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookUser> getBookUsers() {
        return bookUsers;
    }

    public void setBookUsers(Set<BookUser> bookUsers) {
        this.bookUsers = bookUsers;
    }
}
