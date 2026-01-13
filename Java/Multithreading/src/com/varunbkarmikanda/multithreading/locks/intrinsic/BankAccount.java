package com.varunbkarmikanda.multithreading.locks.intrinsic;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance = BigDecimal.valueOf(1000);

    public synchronized void withdrawal(BigDecimal amount){
        System.out.println(Thread.currentThread().getName() + " | Attempting to withdraw: " + amount);
        if(balance.compareTo(amount) >= 0){
            System.out.println(Thread.currentThread().getName() + " | Proceeding to withdraw: " + amount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            balance = balance.subtract(amount);
            System.out.println(Thread.currentThread().getName() + " | Completed withdrawal of "+ amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " | Insufficient balance | Balance amount: " + balance);
        }
    }

}
