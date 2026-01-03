package com.varunbkarmikanda.core.oops.challenge1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {

    private final String accountHolder;

    private BigDecimal balance;

    public BankAccount(String accountHolder, BigDecimal initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public boolean deposit(BigDecimal amount){
        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("ERROR: Deposit amount must be positive!");
            return false;
        }
        this.balance = this.balance.add(amount);
        return true;
    }

    public boolean withdrawal(BigDecimal amount){
        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("ERROR: Withdrawal amount must be positive!");
            return false;
        }
        if(amount.compareTo(balance) > 0){
            System.out.println("ERROR: Insufficient funds for" + accountHolder);
            return false;
        }
        this.balance = this.balance.subtract(amount);
        return true;
    }
}
