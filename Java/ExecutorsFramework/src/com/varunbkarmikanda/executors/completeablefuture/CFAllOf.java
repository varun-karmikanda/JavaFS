package com.varunbkarmikanda.executors.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFAllOf {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("F1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "FAHHHHHHH1";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("F2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "FAHHHHHHH2";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);

//        f.join();

        try {
            f.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");
    }
}
