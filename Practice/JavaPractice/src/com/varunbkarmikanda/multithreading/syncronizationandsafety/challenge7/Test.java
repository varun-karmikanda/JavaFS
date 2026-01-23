package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge7;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public volatile int totalRequests = 0;

    public void increment(){
        totalRequests++;
    }

    public void startSimulation(){
        int numThreads = 50;
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= numThreads; i++) {
            Thread t = new Thread(() -> {
                for (int j = 1; j <= 1000; j++) {
                    increment();
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
        new Test().startSimulation();
    }
}
