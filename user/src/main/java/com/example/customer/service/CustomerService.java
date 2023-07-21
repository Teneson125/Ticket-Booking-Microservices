package com.example.customer.service;

import com.example.customer.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> customerList() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("jeeth", "jeeth@gmail.com");
        customerList.add(customer);
        return customerList;
    }
}
