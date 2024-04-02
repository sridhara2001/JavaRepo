package com.oops.stat;

import java.awt.*;

public class Demo {
    static {
        System.out.println("In demo static block");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main Demo");

        Class.forName("com.oops.stat.Trial");

        Trial.getMessage();
        System.out.println(Trial.x+Trial.y);
    }
}
