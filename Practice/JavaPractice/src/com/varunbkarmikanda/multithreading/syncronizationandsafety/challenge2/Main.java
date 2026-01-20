package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        Runnable task = () -> {
            bank.withdrawal(BigDecimal.valueOf(50));
        };

        Thread t1 = new Thread(task, "T-1");
        Thread t2 = new Thread(task, "T-2");
        Thread t3 = new Thread(task, "T-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
