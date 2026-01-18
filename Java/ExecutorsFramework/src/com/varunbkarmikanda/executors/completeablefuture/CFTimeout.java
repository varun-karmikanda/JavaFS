package com.varunbkarmikanda.executors.completeablefuture;

import java.util.concurrent.*;

public class CFTimeout {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("FAH");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "F1";
        }, executor).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Timeout occurred");

        System.out.println(f1.get());

        executor.shutdown();
    }
}
