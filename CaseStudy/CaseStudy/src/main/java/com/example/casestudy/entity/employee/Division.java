package com.example.casestudy.entity.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @JoinColumn(name = "division_id")
    private int id;
    @JoinColumn(name = "division_name" , columnDefinition = "varchar(45)")
    private String name;

    @OneToMany(mappedBy = "division")
    private Set<Employee>employees;

    public Division() {
    }

    public Division(int id, String name) {
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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
