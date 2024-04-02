package com.inter.extend;

public interface ICalculator {
    void add(int x, int y);
    void product(int x, int y);

    default void sub(int x, int y){
        System.out.println("In Interface "+(x-y));
    }
}
