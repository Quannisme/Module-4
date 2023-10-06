package com.example.casestudy.entity.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @JoinColumn(name = "role_id")
    private int id;
    @JoinColumn(columnDefinition = "varchar(255)" , name = "role_name")
    private String name;
    @OneToMany(mappedBy ="role" )
    private Set<User_Role> user_roleSet;

    public Role() {
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User_Role> getUser_roleSet() {
        return user_roleSet;
    }

    public void setUser_roleSet(Set<User_Role> user_roleSet) {
        this.user_roleSet = user_roleSet;
    }
}
