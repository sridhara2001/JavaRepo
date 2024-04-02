package com.oops.abstraction;

public class AbsMain {
    public  static void main(String[] args) {
        Bank bank = new Branch1();
        bank.carLoan();
        bank.eduLoan();
        bank.houseLoan();
        bank.admin();
        System.out.println("--------------------------");
        Branch1 branch1 = (Branch1) bank;
        branch1.payInterest();
        System.out.println("--------------------------");
        bank = new SubBranch();
    }
}
