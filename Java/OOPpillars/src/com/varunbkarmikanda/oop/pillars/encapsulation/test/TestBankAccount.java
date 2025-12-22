package com.varunbkarmikanda.oop.pillars.encapsulation.test;

public class TestBankAccount {


    // Basically made the instance variable private and the methods public

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(639551);
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(1000);
        bankAccount.withdraw(10);
        System.out.println(bankAccount);

        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1);
    }
}
