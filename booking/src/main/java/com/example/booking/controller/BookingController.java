package com.example.booking.controller;

import com.example.booking.entity.Booking;
import com.example.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("booking")
public class BookingController {
    @Autowired
    private BookingService service;

    @GetMapping("")
    private String status(){
        return "Booking is working";
    }

    @PostMapping("save")
    private String book(@RequestBody Booking booking){
        return service.book(booking);
    }
    @GetMapping("list")
    private List<Booking> list(){
        return service.list();
    }

}
