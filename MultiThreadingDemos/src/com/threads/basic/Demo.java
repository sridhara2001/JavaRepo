package com.threads.basic;

public class Demo {
    public static void main(String[] args) {
        Runnable task = ()->{
            System.out.println("Task1");
        };
        Thread t1 = new Thread(task,"pop");
        Thread t2 = new Thread(()->{
            System.out.println("Task2");
        },"top");
        t1.start();
        t2.start();
    }
}
