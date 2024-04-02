package com.inter.lam;

public class Rectangle implements IShape {
    @Override
    public void area(int x, int y) {
        System.out.println("Rectangle area :"+(x*y));
    }
}
