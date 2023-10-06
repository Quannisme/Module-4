package com.example.casestudy.controller.customer;

import com.example.casestudy.entity.customer.Customer;
import com.example.casestudy.service.customer.inter.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customer")
public class RestCustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/searchCustomer")
    public ResponseEntity<?>getFindByNameOrPhone(@RequestParam("index") String index)
    {
        return new ResponseEntity<>(customerService.findByNameOrPhone(index), HttpStatus.OK);
    }
    @PostMapping("/addCustomer")
    public ResponseEntity<?>getAddCustomer(@RequestBody Customer customer){
        customerService.create(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
