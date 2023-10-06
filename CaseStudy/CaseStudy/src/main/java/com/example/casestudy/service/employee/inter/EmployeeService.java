package com.example.casestudy.service.employee.inter;

import com.example.casestudy.entity.customer.Customer;
import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.entity.employee.Employee;

import java.util.List;

public interface EmployeeService {
    void create(Employee employee);
    List<Employee>findAll();
    void delete(int id);
    Employee findById(int id);
    void update(Employee employee);
}
