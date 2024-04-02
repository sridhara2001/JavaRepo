package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator calculator = (x,y)->x+y;
        System.out.println("Addition :"+calculator.calculate(2,3));

        calculator = (x,y)-> x-y;
        System.out.println("Subtraction :"+calculator.calculate(6,4));

        calculator = (x,y)-> x*y;
        System.out.println("Multiplication :"+calculator.calculate(6,4));

        calculator = (x,y)-> x/y;
        System.out.println("Division :"+calculator.calculate(60,4));
    }
}
