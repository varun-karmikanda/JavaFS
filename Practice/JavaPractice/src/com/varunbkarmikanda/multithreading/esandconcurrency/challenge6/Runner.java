package com.varunbkarmikanda.multithreading.esandconcurrency.challenge6;

import java.util.concurrent.CountDownLatch;

public class Runner implements Runnable{

    private CountDownLatch latch;

    public Runner(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is ready and waiting...");
            latch.await();
            System.out.println(Thread.currentThread().getName() + " | HAS STARTED");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
