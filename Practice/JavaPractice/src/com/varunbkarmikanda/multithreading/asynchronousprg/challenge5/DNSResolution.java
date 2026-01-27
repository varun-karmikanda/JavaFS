package com.varunbkarmikanda.multithreading.asynchronousprg.challenge5;

import java.util.concurrent.CompletableFuture;

public class DNSResolution {
    public static void main(String[] args) {
        CompletableFuture<String> serverA = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(670);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Response from Server A";
        });

        CompletableFuture<String> serverB = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(360);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Response from Server B";
        });

        CompletableFuture.anyOf(serverA, serverB)
                .thenAccept(res -> System.out.println("Winner: " + res));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
