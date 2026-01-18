package com.varunbkarmikanda.executors.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFGet {
    public static void main(String[] args) {
        try {
            String string = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("worker");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "ok";
            }).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");
    }
}
