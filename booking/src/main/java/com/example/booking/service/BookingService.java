package com.example.booking.service;

import com.example.booking.entity.Booking;
import com.example.booking.entity.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    List<Booking> bookingList = new ArrayList<>();
    public String book(Booking booking) {
        bookingList.add(booking);
        return null;
    }
    public List<Booking> list(){
        return bookingList;
    }
}
