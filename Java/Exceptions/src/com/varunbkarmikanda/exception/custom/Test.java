package com.varunbkarmikanda.exception.custom;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);

//        try{
//            bankAccount.withdraw(120);
//        } catch (InsufficientFundsException e) {
//            System.out.println(e);
//        }

        try{
            bankAccount.withdraw(150);
        } catch (CustomException e){
            System.out.println(e);
        }

    }
}
