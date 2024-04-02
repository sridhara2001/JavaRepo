package com.threads.basic;

public class Counter implements Runnable {
    String name;
    int tickets;
    Booking booking;

    public Counter(String name, int tickets, Booking booking) {
        super();
        this.name = name;
        this.tickets = tickets;
        this.booking = booking;
        Thread thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (booking){
            System.out.println("Welcome to ABC Theatres "+name);
            double amount = booking.bookTickets(name,tickets);
            System.out.println("Amount to be paid : "+amount);
        }
    }
}
