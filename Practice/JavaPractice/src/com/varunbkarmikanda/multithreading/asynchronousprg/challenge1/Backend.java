package com.varunbkarmikanda.multithreading.asynchronousprg.challenge1;

import java.util.concurrent.CompletableFuture;

public class Backend {
    public static void main(String[] args) {

//        CompletableFuture.supplyAsync(() -> {
//                    return "Order_#VARUN-99";
//                })
//                .thenApply((id) -> {
//                    return id + " | Base price: $1500";
//                })
//                .thenApply((data) -> {
//                    return data + " | Discount: $50";
//                })
//                .thenAccept(finalInvoice -> {
//                    System.out.println("FINAL INVOICE: " + finalInvoice);
//                });


        CompletableFuture.supplyAsync(() -> "Order_#VARUN-99")
            .thenApply((id) -> id + " | Base price: $1500")
            .thenApply((data) -> data + " | Discount: $50")
            .thenAccept(finalInvoice -> System.out.println("FINAL INVOICE: " + finalInvoice));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
