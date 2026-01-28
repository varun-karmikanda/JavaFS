package com.varunbkarmikanda.atomickeyword.challenge1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class NetworkMonitor {
    public static void main(String[] args){

        AtomicLong totalBytes = new AtomicLong(0);

        try(ExecutorService executor = Executors.newFixedThreadPool(10)){
            for (int i = 1; i <= 10; i++) {
                executor.execute(new TrafficSimulator(totalBytes, 1000));
            }
        }

        System.out.println("Total data processed: " + totalBytes.get() + "bytes");

    }
}
