package com.varunbkarmikanda.multithreading.asynchronousprg.challenge3;

import java.util.concurrent.CompletableFuture;

public class ParallelMerge {
    public static void main(String[] args) {
        CompletableFuture<String> userProfile = CompletableFuture.supplyAsync(() -> {
            return "User: Varun";
        });

        CompletableFuture<Integer> creditScore = CompletableFuture.supplyAsync(() -> 800);

        userProfile.thenCombine(creditScore, (name, score) -> {
                    return "name: " + name + " | credit score: " + score;
                })
                .thenAccept(finalResult -> System.out.println("RESULT >> " + finalResult));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
