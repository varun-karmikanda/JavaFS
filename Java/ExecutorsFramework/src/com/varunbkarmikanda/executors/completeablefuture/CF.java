package com.varunbkarmikanda.executors.completeablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("feat");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            return "Done";
        });

        String s = null;

//        try {
//            s = completableFuture.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

        s = completableFuture.getNow("NA");

        System.out.println(s);
        System.out.println("Main");
    }
}
