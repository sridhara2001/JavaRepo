package com.exceptions.basic;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value :"+value);
            int num = Integer.parseInt(value);
            System.out.println("Number :"+num);
            int result = 100/num;
            System.out.println(result);
            int[] marks = null;
            System.out.println(marks[0]);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Completed...");
    }
}
