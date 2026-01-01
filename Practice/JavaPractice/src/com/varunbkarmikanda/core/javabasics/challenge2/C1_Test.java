package com.varunbkarmikanda.core.javabasics.challenge2;

public class C1_Test {
    public static void main(String[] args) {
        C1_BankAccount bankAccount = new C1_BankAccount(50550.99, 0.05);
        System.out.println(bankAccount);

        if(bankAccount.isDataLost()){
            System.out.println("⚠ WARNING!! DATA LOST");
        }

        System.out.println(bankAccount);

    }
}
