package com.oops.abstraction;

public abstract class Branch2 extends Bank{
    @Override
    void houseLoan() {
        System.out.println("House loan in branch 2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan in branch 2");
    }

    void loanType(){
        System.out.println("Easy EMI Option");
    }
}
