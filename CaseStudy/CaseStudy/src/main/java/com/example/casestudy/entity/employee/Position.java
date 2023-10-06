package com.example.casestudy.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Position {
    @Id
    @JoinColumn(name = "position_id")
    private int id;
    @JoinColumn(columnDefinition = "varchar(45)" , name = "position_name")
    private String name;

    @OneToMany(mappedBy = "position")
    private Set<Employee>employees;

    public Position() {
    }

    public Position(int id, String name, Set<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
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
