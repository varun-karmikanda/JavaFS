package com.varunbkarmikanda.multithreading.esandconcurrency.challenge1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {

        int numberOfThreads = 5;
        int numberOfRequests = 100;

        AtomicInteger count = new AtomicInteger(1);

//        ExecutorService executor = Executors.newFixedThreadPool(
//                numberOfThreads,
//                runnable -> new Thread(runnable, "Email-Worker-" + count.getAndIncrement()));
//
//        for (int i = 1; i <= numberOfRequests; i++) {
//            executor.execute(new EmailService(i));
//        }
//        executor.shutdown();


        try(ExecutorService executor = Executors.newFixedThreadPool(
                numberOfThreads,
                runnable -> new Thread(runnable, "Email-Worker-" + count.getAndIncrement())
        )) {
            for (int i = 1; i <= numberOfRequests; i++) {
                executor.execute(new EmailService(i));
            }
        }

    }
}
