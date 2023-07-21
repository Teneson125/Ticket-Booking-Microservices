package com.example.booking.entity;


public class Booking {
    private String ticketNo;
    private Customer customer;
    private Bus bus;

    public Booking(){}

    public Booking(String ticketNo, Customer customer, Bus bus) {
        this.ticketNo = ticketNo;
        this.customer = customer;
        this.bus = bus;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bus getBus() {
        return bus;
    }
}
