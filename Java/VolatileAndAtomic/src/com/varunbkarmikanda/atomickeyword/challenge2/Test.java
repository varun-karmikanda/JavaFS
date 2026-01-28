package com.varunbkarmikanda.atomickeyword.challenge2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        int numberOfThreads = 50;
        long startTime, endTime, atomicTime, adderTime;
        int updates = 1_000_000;

        AtomicLong counter = new AtomicLong(0);
        LongAdder adder = new LongAdder();

        ExecutorService executor1 = Executors.newFixedThreadPool(numberOfThreads);
        ExecutorService executor2 = Executors.newFixedThreadPool(numberOfThreads);

        startTime = System.currentTimeMillis();
        for (int i = 1; i <= numberOfThreads; i++) {
            executor1.execute(() -> {
                for (int j = 0; j < updates; j++) {
                    counter.incrementAndGet();
                }
            });
        }
        executor1.shutdown();
        executor1.awaitTermination(20, TimeUnit.SECONDS);
        endTime = System.currentTimeMillis();

        atomicTime = endTime - startTime;
        System.out.println("ATOMIC TIME: " + atomicTime + "ms | RESULT: " + counter.get());

        startTime = System.currentTimeMillis();
        for (int i = 1; i <= 50; i++) {
            executor2.execute(() -> {
                for (int j = 0; j < updates; j++) {
                    adder.add(1);
                }
            });
        }
        executor2.shutdown();
        executor2.awaitTermination(20, TimeUnit.SECONDS);
        endTime = System.currentTimeMillis();

        adderTime = endTime - startTime;
        System.out.println("ADDER TIME: " + adderTime + "ms | RESULT: " + adder.sum());

    }
}
