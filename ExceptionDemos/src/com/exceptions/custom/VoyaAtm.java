package com.exceptions.custom;

public class VoyaAtm {
    public static void main(String[] args) {
        System.out.println("In ATM");
        VoyaBank bank = new VoyaBank(8000);
        try {
            bank.withdraw(1000.0);
            System.out.println("Amount withdrawn");
        }catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }catch (ExceedingLimitException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("Good Bye");
    }
}
