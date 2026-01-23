package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    private final AtomicInteger totalRequests = new AtomicInteger(0);

    public void startSimulation(){
        int numThreads = 50;
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= numThreads; i++) {
            Thread t = new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    totalRequests.incrementAndGet();
                }
            }, "Thread-" + i);

            threads.add(t);
            t.start();
        }

        for (Thread t: threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total requests: " + totalRequests);
    }

    public static void main(String[] args) throws InterruptedException {
        new Main().startSimulation();
    }

}
