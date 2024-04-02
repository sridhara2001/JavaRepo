package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Customer> customerByCity = new ArrayList<>();
        customerList.add(new Customer("Sridhar",18,"Bengaluru"));
        customerList.add(new Customer("Likhith",7,"Bhadravati"));
        customerList.add(new Customer("Amogha",333,"Nelamangala"));
        customerList.add(new Customer("Chida",10,"Shira"));
        customerList.add(new Customer("Harsha",17,"Tumkur"));

        for (Customer customer : customerList){
            System.out.println(customer);
        }

        System.out.println("-------------------------------------");

        for (Customer customer : customerList){
            if(customer.getCity().equalsIgnoreCase("bengaluru")){
                customerByCity.add(customer);
            }
        }

        for (Customer city : customerByCity){
            System.out.println(city);
        }
    }
}
