package com.inter.basics;

public class DeveloperDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equalsIgnoreCase("indoor")){
            System.out.println("Carom and Shuttle available");
        }else{
            System.out.println("Football");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with football players");
    }
}
