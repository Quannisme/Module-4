package com.example.casestudy.service.employee.impl;

import com.example.casestudy.entity.employee.EducationDegree;
import com.example.casestudy.repository.employee.EducationDegreeRepository;
import com.example.casestudy.service.employee.inter.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
