package com.example.casestudy.service.employee.inter;

import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.entity.employee.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAll();
}
