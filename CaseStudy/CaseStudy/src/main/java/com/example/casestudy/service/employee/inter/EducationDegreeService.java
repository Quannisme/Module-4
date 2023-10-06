package com.example.casestudy.service.employee.inter;

import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.entity.employee.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    List<EducationDegree> findAll();
}
