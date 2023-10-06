package com.example.casestudy.entity.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @JoinColumn(name = "Education_degree_id")
    private int id;
    @JoinColumn(columnDefinition = "varchar(45)" , name = "education_Degree_name")
    private String name;

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee>employees;

    public EducationDegree() {
    }

    public EducationDegree(int id, String name, Set<Employee> employees) {
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
