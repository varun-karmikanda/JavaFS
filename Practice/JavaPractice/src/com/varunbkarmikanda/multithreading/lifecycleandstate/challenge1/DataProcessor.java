package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge1;

public class DataProcessor extends Thread{
    @Override
    public void run(){
        while ((!Thread.currentThread().isInterrupted())){
            System.out.println("Processing data batch");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep. Shutting down");
                Thread.currentThread().interrupt();
            } finally {
                System.out.println("Resource release. Thread exiting...");
            }
        }
    }
}
