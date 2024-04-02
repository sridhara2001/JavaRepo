package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = Arrays.asList(
                new Vehicle("City","Honda",430000),
                new Vehicle("Hexa","Tata",648000),
                new Vehicle("Santro","Volkswagen",789000),
                new Vehicle("A100","Audi",530000),
                new Vehicle("Swift","Maruthi",980000)
        );

        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sorting By Brand");
        System.out.println();

        Collections.sort(vehicleList,(o1, o2) -> {
            return o1.getBrand().compareTo(o2.getBrand());
        });

        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sorting By Model");
        System.out.println();

        Collections.sort(vehicleList,(o1, o2) -> o1.getModel().compareTo(o2.getModel()));

        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sorting By Price");
        System.out.println();

        Collections.sort(vehicleList,(o1, o2) -> {
            return ((Long)o1.getPrice()).compareTo(o2.getPrice());
        });

        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }
    }
}
