package com.example.casestudy.util;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.entity.customer.Customer;
import com.example.casestudy.service.customer.inter.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CustomerValidator implements Validator {
    @Autowired
    private CustomerService customerService;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof CustomerDto))
        {
            return;
        }
    }

}
