package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.getDetails();
        System.out.println("--------------------------");
        Vehicle vehicle2 = new Vehicle("Audi");
        vehicle2.getDetails();
        System.out.println("--------------------------");
        Vehicle vehicle3 = new Vehicle("Audi","2020");
        vehicle3.getDetails();
        System.out.println("--------------------------");
        Vehicle vehicle4 = new Vehicle("Audi",400000,"2020");
        vehicle4.getDetails();

    }
}
