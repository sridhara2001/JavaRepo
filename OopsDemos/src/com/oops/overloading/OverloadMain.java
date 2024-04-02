package com.oops.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calcArea(10);
        shape.calcArea(3.0);
        int rect = shape.calcArea(10,20);
        System.out.println("Rect : "+rect);
        double tri = shape.calcArea((int)12.0,4);
        System.out.println(tri);
        int tri1 = (int) shape.calcArea(12.0, 4);
        System.out.println(tri1);
    }
}
