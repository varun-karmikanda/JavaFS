package com.varunbkarmikanda.multithreading.interthreadcomm.challenge5;

import java.util.concurrent.Semaphore;

public class DatabasePool implements Runnable{
    private final Semaphore semaphore;

    public DatabasePool(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    public void accessDatabase(){
        try {
            System.out.println(Thread.currentThread().getName() + " | Waiting for connection...");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " >> CONNECTION ACQUIRED");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " << RELEASING CONNECTION");
            semaphore.release();
        }
    }

    @Override
    public void run(){
        accessDatabase();
    }

}
