package com.exceptions.custom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        super();
        this.balance = balance;
    }

    void withdraw(double amount) throws NegativeBalanceException, ExceedingLimitException {
        System.out.println("In withdraw method");
        try{
            if (balance-amount<=0){
                throw new NegativeBalanceException("limit exceeded");
            }
            if (amount>1000){
                throw new ExceedingLimitException("limit exceeded");
            }
        }catch (NegativeBalanceException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }catch (ExceedingLimitException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Close db");
        }
    }
}
