package com.example.booking.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private String email;

    public Customer(){
    }
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
