package com.example.casestudy.entity.employee;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class User_Role {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name ="id_Role" )
    Role role;

    @ManyToOne
    @JoinColumn(name = "id_User")
    private User user;

    public User_Role() {
    }

    public User_Role(int id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
