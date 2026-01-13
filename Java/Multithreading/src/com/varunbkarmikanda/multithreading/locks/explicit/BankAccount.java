package com.varunbkarmikanda.multithreading.locks.explicit;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    public BigDecimal balance = BigDecimal.valueOf(1000);

    private final Lock lock = new ReentrantLock();

    public void withdraw(BigDecimal amount){
        System.out.println(Thread.currentThread().getName() + " | Attempting to withdraw: " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance.compareTo(amount) >= 0){
                    try{
                        System.out.println(Thread.currentThread().getName() + " | Proceeding to withdraw: " + amount);
                        Thread.sleep(3000);
                        balance = balance.subtract(amount);
                        System.out.println(Thread.currentThread().getName() + " | Completed withdrawal of "+ amount + " | Balance: " + balance);
                    } catch (Exception e){
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " | Insufficient balance | Balance amount: " + balance);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " | Could not acquire the lock.");
            }
        } catch (Exception e){
            Thread.currentThread().interrupt();
        }

    }

}
