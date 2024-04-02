package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Audi","2020","Black");
        Vehicle v2 = new Vehicle("Audi","2020","White");
        Vehicle v3 = new Vehicle("Audi","2022","White");
        Vehicle v4 = new Vehicle("Audi","2022","Black");

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v4));

        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
        System.out.println(v4.hashCode());

    }
}
