package com.varunbkarmikanda.multithreading.locks.reentrant.fairnesslocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLock {

    private final Lock unfair = new ReentrantLock();

    public void accessResource(){
        unfair.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(3000);
        } catch (Exception e){
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            unfair.unlock();
        }
    }

    public static void main(String[] args) {
        UnFairLock unFairLock = new UnFairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                unFairLock.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }

}
