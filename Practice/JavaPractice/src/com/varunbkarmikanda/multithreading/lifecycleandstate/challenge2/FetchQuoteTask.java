package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge2;

public class FetchQuoteTask implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Request to fetch quote...");
            Thread.sleep(5000);
            System.out.println("Request successful");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println("Resource released. Thread exiting...");
        }
    }
}
