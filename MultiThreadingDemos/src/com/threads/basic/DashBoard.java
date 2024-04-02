package com.threads.basic;

public class DashBoard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Counter counter1 = new Counter("Sridhar",10,booking);
        Counter counter2 = new Counter("Likhith",20,booking);
        Counter counter3 = new Counter("Chida",30,booking);
    }
}
