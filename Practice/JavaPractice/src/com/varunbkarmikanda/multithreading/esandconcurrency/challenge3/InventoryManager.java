package com.varunbkarmikanda.multithreading.esandconcurrency.challenge3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class InventoryManager {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        Map<String, Integer> stockMap = new ConcurrentHashMap<>();
//        Map<String, Integer> stockMap = new HashMap<>();
        AtomicInteger count = new AtomicInteger(1);

        try (ExecutorService executor = Executors.newFixedThreadPool(
                numberOfThreads,
                runnable -> new Thread(runnable, "WAREHOUSE_WORKER-" + count.getAndIncrement())

        )) {
            for (int i = 0; i < 10; i++) {
                executor.execute(new InventoryWorker(stockMap, 100));
            }
        }

        System.out.println("Final laptop count: " + stockMap.get("Laptop"));
    }
}
