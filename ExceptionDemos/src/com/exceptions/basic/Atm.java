package com.exceptions.basic;

public class Atm {
    public static void main(String[] args) {
        System.out.println("ATM");
        Bank bank = new Bank();
        try{
            bank.withdraw(2000);
            System.out.println("Amount withdrawn");
        }catch (Exception e){
            System.out.println("exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("Good bye");
    }
}
