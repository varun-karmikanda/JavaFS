package com.varunbkarmikanda.multithreading.locks.reentrant.fairnesslocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock {

    // Lock fairness ensures there is FIFO and no starvation

    private final Lock fairLock = new ReentrantLock(true);

    public void accessResources(){
        fairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            fairLock.unlock();
        }
    }

    public static void main(String[] args){
        FairLock fairLock = new FairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairLock.accessResources();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

//        t1.start();
//        t2.start();
//        t3.start();

        try{
            t1.start();
            Thread.sleep(50);
            t2.start();
            Thread.sleep(50);
            t3.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
