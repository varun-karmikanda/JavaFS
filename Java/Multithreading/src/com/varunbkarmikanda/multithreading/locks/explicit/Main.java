package com.varunbkarmikanda.multithreading.locks.explicit;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount vbk = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                vbk.withdraw(BigDecimal.valueOf(50));
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
    }
}
