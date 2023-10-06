package com.example.casestudy.service.employee.impl;

import com.example.casestudy.entity.employee.Position;
import com.example.casestudy.repository.employee.PositionRepository;
import com.example.casestudy.service.employee.inter.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
