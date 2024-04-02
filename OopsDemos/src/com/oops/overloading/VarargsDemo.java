package com.oops.overloading;

public class VarargsDemo {

    void calcSum(String name, int... marks){
        System.out.println("Welcome "+name);
        int sum=0;
        for(int mark : marks) {
            sum += mark;
        }
        System.out.println("Marks is : " + sum);
    }

    void calcSum(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        VarargsDemo demo = new VarargsDemo();
        demo.calcSum("Sridhar",90,80,90);
        System.out.println("----------------------");
        demo.calcSum("Likhith");
        System.out.println("----------------------");
        demo.calcSum("Harsha",90,80);
    }
}
