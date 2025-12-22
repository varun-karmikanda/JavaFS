package com.varunbkarmikanda.oop.pillars.encapsulation.test;

public class BankAccount {

    private long accountNumber;

    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance  : " + this.balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount){
        if(balance >= amount && amount > 0){
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("Balance : " + this.balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "\n\taccountNumber=" + accountNumber + "," +
                "\n\tbalance=" + balance +
                "\n}";
    }
}
