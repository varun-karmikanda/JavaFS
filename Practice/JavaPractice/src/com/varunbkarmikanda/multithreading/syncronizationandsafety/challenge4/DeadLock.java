package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge4;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    static final ReentrantLock lockBilling = new ReentrantLock();
    static final ReentrantLock lockInventory = new ReentrantLock();

    static Runnable task1 = () -> {
      try {
          synchronized (lockBilling) {
            lockBilling.lock();
            System.out.println(Thread.currentThread().getName() + " | Locked billing record.");
            Thread.sleep(100);
            synchronized (lockInventory) {
                lockInventory.lock();
                System.out.println(Thread.currentThread().getName() + " | Locked inventory.");
            }
          }
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
      }
    };

    static Runnable task2 = () -> {
        try {
            synchronized (lockInventory) {
                lockInventory.lock();
                System.out.println(Thread.currentThread().getName() + " | Locked inventory.");
                Thread.sleep(100);
                synchronized (lockBilling) {
                    lockBilling.lock();
                    System.out.println(Thread.currentThread().getName() + " | Locked billing record.");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(task1,"T-1");
        Thread t2 = new Thread(task1,"T-2");

        t1.start();
        t2.start();


    }
}
