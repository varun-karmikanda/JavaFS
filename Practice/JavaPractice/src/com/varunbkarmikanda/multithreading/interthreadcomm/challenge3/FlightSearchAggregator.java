package com.varunbkarmikanda.multithreading.interthreadcomm.challenge3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class FlightSearchAggregator implements Runnable{

    private final String airlineName;

    private final CountDownLatch latch;

    public FlightSearchAggregator(String airlineName, CountDownLatch latch) {
        this.airlineName = airlineName;
        this.latch = latch;
    }

    private void execute(){
        try {
            System.out.println(Thread.currentThread().getName() + " | Trying to fetch price from airline: " + airlineName);
            int delay = ThreadLocalRandom.current().nextInt(1000, 3001);
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName() + " | Returning the prices of airline: " + airlineName);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }

    @Override
    public void run() {
        execute();
    }
}
