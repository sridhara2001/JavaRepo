package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape shape = (x,y)-> System.out.println("Area of rectangle :"+x*y);

        shape.area(2,4);

        shape = (x,y)->{
            float area = x*y/2;
            System.out.println("Area of triangle :"+area);
        };
        shape.area(5,6);
    }
}
