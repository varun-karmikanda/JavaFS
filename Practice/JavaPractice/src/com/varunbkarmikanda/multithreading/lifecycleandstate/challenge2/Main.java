package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge2;

public class Main {
    public static void main(String[] args) {
        FetchQuoteTask fetchQuote = new FetchQuoteTask();
        Thread thread = new Thread(fetchQuote);

        thread.start();

        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if(thread.isAlive()){
            System.out.println("Server too slow. Using cached quote.");
        } else {
            System.out.println("Quote fetched successfully");
        }

        thread.interrupt();

        System.out.println("Shutting down..");
    }
}
