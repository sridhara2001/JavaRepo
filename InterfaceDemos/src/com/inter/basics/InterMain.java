package com.inter.basics;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment entertainment = new ManagerDetails();
        entertainment.showGames("outdoor");
        entertainment.showActivity();
        System.out.println("---------------------");
        entertainment=new DeveloperDetails();
        entertainment.showGames("indoor");
        entertainment.showActivity();
    }
}
