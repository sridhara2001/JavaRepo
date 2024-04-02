package com.oops.abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("Car loan in Branch 1");
    }

    @Override
    void houseLoan() {
        System.out.println("House loan in Branch 1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan in Branch 1");
    }

    void payInterest(){
        System.out.println("The interest is branch 1");
    }
}
