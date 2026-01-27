package com.varunbkarmikanda.multithreading.asynchronousprg.challenge4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class DataFetcher {
    public static void main(String[] args) {
        CompletableFuture<String> futureDB = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "DB_DATA";
        });

        CompletableFuture<String> futureCache = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "CACHE_DATA";
        });

        CompletableFuture<String> futureAPI = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "API_DATA";
        });

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(futureDB, futureCache, futureAPI);

        allTasks.thenRun(() -> {
            System.out.println("All data reached!");
            System.out.println("Values: " + futureDB.join() + ", " + futureCache.join() + ", " + futureAPI.join());
//            try {
//                System.out.println("Values: " + futureDB.get() + ", " + futureCache.get() + ", " + futureAPI.get());
//            } catch (InterruptedException | RuntimeException | ExecutionException e) {
//                Thread.currentThread().interrupt();
//            }
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
