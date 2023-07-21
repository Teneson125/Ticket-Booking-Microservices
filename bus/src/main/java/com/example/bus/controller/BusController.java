package com.example.bus.controller;

import com.example.bus.entity.Bus;
import com.example.bus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bus")
public class BusController {
    @Autowired
    private BusService service;

    @GetMapping("")
    private String status(){
        return "Bus is working";
    }

    @GetMapping("list")
    private List<Bus> list(){
        return service.busList();
    }
}
