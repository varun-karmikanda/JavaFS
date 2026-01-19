package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge1;

public class Main {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();

        dp.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        dp.interrupt();

        System.out.println("Main requested shutdown");
    }
}
