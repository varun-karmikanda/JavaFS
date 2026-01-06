package com.varunbkarmikanda.core.exceptionhandling.challenge1;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance;

    public BankAccount(BigDecimal balance){
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount) throws InsufficientFundsException {
        if(amount.compareTo(new BigDecimal("0")) < 0){
            throw new IllegalArgumentException();
        }
        if ((balance.compareTo(amount)) < 0){
            throw new InsufficientFundsException("Insufficient funds! Current balance: "+balance);
        }
        balance = balance.subtract(amount);
        System.out.println("Withdrawal successful! Balance: "+balance);
    }

}
