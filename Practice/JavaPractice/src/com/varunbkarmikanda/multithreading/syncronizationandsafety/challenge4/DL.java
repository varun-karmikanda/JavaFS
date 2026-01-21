package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge4;

import java.util.concurrent.locks.ReentrantLock;

public class DL {
    static final ReentrantLock lockBilling = new ReentrantLock();
    static final ReentrantLock lockInventory = new ReentrantLock();

    static Runnable task1 = () -> {
        lockInOrder(lockBilling, lockInventory);
    };

    static Runnable task2 = () -> {
//        lockInOrder(lockInventory, lockBilling);  // DeadLock case
        lockInOrder(lockBilling, lockInventory);
    };

    private static void lockInOrder(ReentrantLock firstLock, ReentrantLock secondLock){
        try {
            firstLock.lock();
            System.out.printf("[%s] Acquired: %s%n", Thread.currentThread().getName(), "First Lock");

            Thread.sleep(100);

            secondLock.lock();
            try {
                System.out.printf("[%s] Acquired: %s. %nTransaction complete.%n", Thread.currentThread().getName(), "Second Lock");
            } finally {
                secondLock.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            firstLock.unlock();
        }
    }

    public static void main(String[] args) {
        new Thread(task1, "Billing-Service").start();
        new Thread(task2, "inventory-Service").start();
    }
}
