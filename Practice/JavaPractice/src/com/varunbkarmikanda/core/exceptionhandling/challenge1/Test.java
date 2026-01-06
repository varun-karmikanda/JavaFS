package com.varunbkarmikanda.core.exceptionhandling.challenge1;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        BigDecimal balance = new BigDecimal(1000);
//        BigDecimal amount = new BigDecimal(5000);
        BigDecimal amount = new BigDecimal(-1);

        BankAccount bankAccount = new BankAccount(balance);
        try {
            bankAccount.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("ALERT: "+ e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ALERT: Invalid amount entered!");
        } finally {
            System.out.println("Transaction attempt completed!");
        }
    }
}
