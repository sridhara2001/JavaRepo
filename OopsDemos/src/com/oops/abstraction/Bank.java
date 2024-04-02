package com.oops.abstraction;

public abstract class Bank {
    abstract void carLoan();
    abstract void houseLoan();
    abstract void eduLoan();

    void admin(){
        System.out.println("Admin details in Bank");
    }

}
