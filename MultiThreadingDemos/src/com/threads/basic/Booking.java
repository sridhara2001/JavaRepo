package com.threads.basic;

public class Booking {
    public double bookTickets(String name, int tickets){
        double costPerTicket = 200;
        System.out.println("Booked for "+name);
        double totalPrice = costPerTicket*tickets;
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Total Price : "+totalPrice);
        return totalPrice;
    }
}
