package com.list.custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
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
        System.out.println("Sort By Brand");
        System.out.println();
        Collections.sort(vehicleList,new BrandSort());
        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sort By Model");
        System.out.println();
        Collections.sort(vehicleList,new ModelSort());
        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sort By Price");
        System.out.println();
        Collections.sort(vehicleList,new PriceSort());
        for (Vehicle vehicle:vehicleList){
            System.out.println(vehicle);
        }
    }
}
