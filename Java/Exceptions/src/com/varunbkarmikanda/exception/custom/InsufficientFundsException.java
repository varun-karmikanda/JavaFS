package com.varunbkarmikanda.exception.custom;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount){
        super("No $$ duh!");
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

}
