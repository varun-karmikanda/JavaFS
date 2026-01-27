package com.varunbkarmikanda.multithreading.esandconcurrency.challenge6;

import java.util.concurrent.CountDownLatch;

public class RaceManager {
    public static void main(String[] args){
        CountDownLatch latch = new CountDownLatch(1);

        for (int i = 1; i <= 5; i++) {
            new Thread(new Runner(latch), "THREAD-" + i).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("FAHHHHHHH");

        latch.countDown();
    }
}
