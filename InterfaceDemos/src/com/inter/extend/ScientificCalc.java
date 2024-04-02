package com.inter.extend;

public class ScientificCalc extends BasicCalculator implements IScientific {

    @Override
    public void square(int x) {
        System.out.println("In Scientific "+Math.pow(x,2));
    }

    @Override
    public void cube(int x) {
        System.out.println("In Scientific "+Math.pow(x,3));
    }
}
