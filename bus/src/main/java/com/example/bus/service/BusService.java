package com.example.bus.service;

import com.example.bus.entity.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {

    public List<Bus> busList() {
        List<Bus> busList = new ArrayList<>();
        Bus bus = new Bus("bus 1", 1);
        busList.add(bus);
        return busList;
    }
}
