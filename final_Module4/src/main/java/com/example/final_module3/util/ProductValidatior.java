package com.example.final_module3.util;

import com.example.final_module3.entity.Product;
import com.example.final_module3.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductValidatior implements Validator {
    @Autowired
    private ProductServiceInter productServiceInter;
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(target instanceof Product){
            return;
        }

    }
}
