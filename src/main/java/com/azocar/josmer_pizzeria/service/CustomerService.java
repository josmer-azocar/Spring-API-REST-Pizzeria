package com.azocar.josmer_pizzeria.service;

import com.azocar.josmer_pizzeria.persistence.entity.CustomerEntity;
import com.azocar.josmer_pizzeria.persistence.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity findByPhoneNumber(String phone){
        return this.customerRepository.findByPhoneNumber(phone);
    }
}
