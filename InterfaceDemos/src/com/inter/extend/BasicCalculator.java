package com.inter.extend;

public class BasicCalculator implements ICalculator {
    @Override
    public void add(int x, int y) {
        int sum = x+y;
        System.out.println("In Basic "+sum);
    }

    @Override
    public void product(int x, int y) {
        int product = x*y;
        System.out.println("In Basic "+product);
    }
}
