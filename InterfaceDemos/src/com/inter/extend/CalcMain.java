package com.inter.extend;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();
        calculator.add(2,4);
        calculator.product(3,6);

        IScientific scientific = new ScientificCalc();
        scientific.square(3);
        scientific.cube(4);
        scientific.add(3,6);
        scientific.product(3,9);

        calculator.sub(98,80);
    }
}
