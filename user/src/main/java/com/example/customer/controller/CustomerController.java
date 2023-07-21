package com.example.customer.controller;

import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("")
    private String status(){
        return "Customer is working";
    }

    @GetMapping("list")
    private List<Customer> listCustomer(){
        List<Customer> customerList = service.customerList();
        for(Customer c: customerList){
            System.out.println(c);
        }
        return customerList;
    }
}
