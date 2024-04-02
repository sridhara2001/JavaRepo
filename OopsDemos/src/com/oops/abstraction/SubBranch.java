package com.oops.abstraction;

public class SubBranch extends Bank {
    @Override
    void carLoan() {
        System.out.println("Car loan in branch 2");
    }

    @Override
    void houseLoan() {
        System.out.println("House loan in branch 2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan in branch 2");
    }

    void loanType() {
        System.out.println("Easy EMI Option");
    }
}
