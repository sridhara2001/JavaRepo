package com.threads.concurrency;

import com.threads.basic.Booking;
import com.threads.basic.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // creating independent tasks
        executorService.execute(()->{
            System.out.println("Doing polling");
            Greetings greet = new Greetings();
            greet.sayHello("Sridhar");
        });

        executorService.execute(()->{
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Sridhar",10));
        });

        executorService.execute(()->{
            System.out.println("Reading from DB");
        });
    }
}
