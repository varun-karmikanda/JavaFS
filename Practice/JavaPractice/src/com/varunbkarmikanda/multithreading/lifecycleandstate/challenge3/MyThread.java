package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge3;

public class MyThread {
    public static void main(String[] args) {
        Thread worker = new Thread(
                () -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
        );

        System.out.println(worker.getState());

        worker.start();
        System.out.println(worker.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(worker.getState());

        try {
            worker.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(worker.getState());
    }
}
