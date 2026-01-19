package com.varunbkarmikanda.multithreading.basics.challenge4;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserTracker tracker = new UserTracker();

        int numberOfThreads = 100;
        Thread[] thread = new Thread[numberOfThreads];

        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        Runnable task = () ->{
            try{
                tracker.increment();
            } finally {
                latch.countDown();
            }
        };

        for (int i = 0; i < numberOfThreads; i++) {
            thread[i] = new Thread(task, "Thread-" + (i + 1 ));
            thread[i].start();
        }

        latch.await();

//        for (Thread t: thread){
//            t.join();
//        }

        System.out.println("Active users: " + tracker.getActiveUsers());
    }
}
