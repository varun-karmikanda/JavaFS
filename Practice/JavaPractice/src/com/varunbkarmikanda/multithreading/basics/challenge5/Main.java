package com.varunbkarmikanda.multithreading.basics.challenge5;

public class Main {
    static Runnable task = () -> {
        while (true){
            System.out.println("Cleaning up logs...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(task);

        thread.setDaemon(true);

        thread.start();

        System.out.println("Main app started...");

        Thread.sleep(2000);

        System.out.println("Main app exiting...");
    }
}
