package com.oops.overriding;

public class OverrideDemo {
    public static void main(String[] args) {
        String choice = "indoor";
        Sports sports = null;

        if(choice.equals("indoor"))
            sports = new Indoor();
        else if (choice.equals("outdoor")) {
            sports = new Outdoor();
        }else {
            sports = new Sports();
        }
        String[] games = sports.showTypes();
            for (String game:games){
                if(game!=null){
                    System.out.println(game);
                }
            }
    }
}

