package com.varunbkarmikanda.multithreading.asynchronousprg.challenge2;

import java.util.concurrent.CompletableFuture;

public class ErrorHandling {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException("DATABASE_TIMEOUT");
                })
                .exceptionally(ex -> {
                    System.out.println("Caught ERROR: " + ex.getMessage());
                    return "Order_System_Error";
                })
                .thenApply(id -> id + " | Base price: $0")
                .thenApply(data -> data + " | Status: Pending Review")
                .thenAccept(finalResult -> System.out.println("FINAL STATE >> " + finalResult));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
