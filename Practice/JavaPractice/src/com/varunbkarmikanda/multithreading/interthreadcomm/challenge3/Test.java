package com.varunbkarmikanda.multithreading.interthreadcomm.challenge3;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);

//        int cores = Runtime.getRuntime().availableProcessors();-


        System.out.println(Thread.currentThread().getName() + "          | Searching for flights...");

        new Thread(new FlightSearchAggregator("Delta", latch), "DELTA-API    ").start();
        new Thread(new FlightSearchAggregator("Emirates", latch), "EMIRATES-API ").start();
        new Thread(new FlightSearchAggregator("Lufthansa", latch), "LUFTHANSA-API").start();

        latch.await();

        System.out.println(Thread.currentThread().getName() + "          | All airline responded.");

    }
}
