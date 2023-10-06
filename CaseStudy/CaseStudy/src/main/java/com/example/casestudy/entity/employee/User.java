package com.example.casestudy.entity.employee;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @JoinColumn(columnDefinition = "varchar(255)" , name = "username")
    private String userName;
    @JoinColumn(columnDefinition = "varchar(255) " , name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<User_Role> user_roles;

    @OneToMany(mappedBy ="user" )
    private Set<Employee>employees;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User_Role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(Set<User_Role> user_roles) {
        this.user_roles = user_roles;
    }
}
