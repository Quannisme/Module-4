package com.example.casestudy.service.customer.imple;

import com.example.casestudy.entity.customer.CustomerType;
import com.example.casestudy.repository.customer.CustomerTypeRepository;
import com.example.casestudy.service.customer.inter.CustomerService;
import com.example.casestudy.service.customer.inter.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(int id) {
        return customerTypeRepository.findById(id).orElse(null);
    }
}
