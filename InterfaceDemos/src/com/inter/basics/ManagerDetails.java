package com.inter.basics;

public class ManagerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if(type.equalsIgnoreCase("indoor")){
            System.out.println("Chess and Table tennis available");
        }else{
            System.out.println("Cricket");
        }
    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with cricketer players");
    }
}
