package com.exceptions.basic;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "Sridhar";
            System.out.println("Value :"+value);
            int num = Integer.parseInt(value);
            System.out.println("Number :"+num);
            int result = 100/num;
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Close the connection");
        }
        System.out.println("Continue...");
    }
}
