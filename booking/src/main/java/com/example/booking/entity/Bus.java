package com.example.booking.entity;

import org.springframework.stereotype.Component;

@Component
public class Bus {
    private String busName;
    private int busNumber;

    public Bus(){}

    public Bus(String busName, int busNumber) {
        this.busName = busName;
        this.busNumber = busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public int getBusNumber() {
        return busNumber;
    }
}
