package com.threads.basic;

class Child extends  Thread{
    public Child(String name, int priority) {
        super(name);
        System.out.println(this);
//        this.start();
    }

    // this is the CPU
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            String name = Thread.currentThread().getName();
            System.out.println("5 * "+i+" = "+5*i+" ---> "+name);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("---------------------");
    }
}

public class ExThread {
    public static void main(String[] args) {
//        Child child1 = new Child("Child-One",10);
//
//        Child child2 = new Child("Child-Two",6);
        Child child3 = new Child("Child-Three",8);
        child3.setDaemon(true);
        child3.start();

       for (int i=1; i<=10; i++){
           String name = Thread.currentThread().getName();
           System.out.println("6 * "+i+" = "+6*i+" ---> "+name);
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       }
//        try {
////            child1.join();
////            child2.join();
//            child3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Main Thread Completed");
    }
}
