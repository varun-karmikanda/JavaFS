package com.varunbkarmikanda.exception.custom;

public class BankAccount {

    private double balance;

    private double amount;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws CustomException {
        if(amount > balance){
            throw new CustomException("Insufficient balance!!", amount);
        }
        balance -= amount;
    }

}
