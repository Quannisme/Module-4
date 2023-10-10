package com.example.final_module3.controller;

import com.example.final_module3.repository.ProductRepository;
import com.example.final_module3.service.inter.CategoryServiceInter;
import com.example.final_module3.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class RestProductController {
    @Autowired
    private ProductServiceInter productServiceInter;
    @Autowired
    private CategoryServiceInter categoryServiceInter;
    @GetMapping("/searchByName")
    public ResponseEntity<?> getFindByName(@RequestParam("index") String index)
    {
        return new ResponseEntity<>(productServiceInter.findByName(index), HttpStatus.OK);
    }
    @GetMapping("/searchByPrice")
    public ResponseEntity<?>getFindByPrice(@RequestParam("index") double price)
    {
        return new ResponseEntity<>(productServiceInter.findByPrice(price),HttpStatus.OK);
    }
    @GetMapping("/searchById")
    public ResponseEntity<?>getFindByIdCategory(@RequestParam("index") int id)
    {
        return new ResponseEntity<>(categoryServiceInter.findById(id),HttpStatus.OK);
    }
}
