package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge2;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private BigDecimal balance = BigDecimal.valueOf(1000);

    private final ReentrantLock lock = new ReentrantLock();

    public void withdrawal(BigDecimal amount){
        System.out.println(Thread.currentThread().getName() + " | Attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                if (balance.compareTo(amount) >= 0) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " | Proceeding to withdraw " + amount);
                        balance.subtract(amount);
                        Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName() + " | Withdrawal success");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " | Insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " | Could not acquire lock");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
