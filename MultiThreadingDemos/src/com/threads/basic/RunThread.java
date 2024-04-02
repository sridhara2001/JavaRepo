package com.threads.basic;

class Runner implements Runnable{
    String name;
    Greetings greetings;
    public Runner(String name, Greetings greetings){
        Thread t = new Thread(this,name);
        this.name = name;
        this.greetings = greetings;
        t.start();
    }

    @Override
    public void run() {
        synchronized (greetings){
            System.out.println(greetings.sayHello(name));
            System.out.println("Done");
        }
    }
}

public class RunThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner runner1 = new Runner("Sridhar",greetings);
        Runner runner2 = new Runner("Likhith",greetings);
        Runner runner3 = new Runner("Amogha",greetings);
        Runner runner4 = new Runner("Chida",greetings);
    }
}
