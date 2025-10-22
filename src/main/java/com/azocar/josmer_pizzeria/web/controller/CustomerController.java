package com.azocar.josmer_pizzeria.web.controller;

import com.azocar.josmer_pizzeria.persistence.entity.CustomerEntity;
import com.azocar.josmer_pizzeria.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/phone/{phone}")
    public ResponseEntity<CustomerEntity> getByPhoneNumber(@PathVariable String phone){
        return ResponseEntity.ok(customerService.findByPhoneNumber(phone));
    }
}
