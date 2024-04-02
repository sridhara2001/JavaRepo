package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // create a reference of IShape
        IShape shape = new Rectangle();
        // pass this as parameter
        factory.printArea(shape,10,20);
        System.out.println("-------------------------");

        // using anonymous inner class
        factory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculated Area");
                System.out.println("Triangle area :"+(x*y*0.5));
            }
        }, 20, 30);
        System.out.println("-------------------------");

        factory.printArea((x,y)->{
            System.out.println("Calculated Square Area");
            System.out.println("Square area :"+(x*x));
        },2,4);
    }
}
