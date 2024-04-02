package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {
        IShape shape = new IShape() {
            @Override
            public void area(int x, int y) {
                int area = x*y;
                System.out.println("Area of Rectangle :"+area);
            }
        };

        shape.area(2,4);

        IShape shape1 = new IShape() {
            @Override
            public void area(int x, int y) {
                float area = x*y/2;
                System.out.println("Area of triangle :"+area);
            }
        };

        shape1.area(4,2);
    }
}
