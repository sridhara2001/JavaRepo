package com.oops.bean;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Audi");
        vehicle.setModel("2022");
        vehicle.setPrice(200000);

        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle);
    }
}
