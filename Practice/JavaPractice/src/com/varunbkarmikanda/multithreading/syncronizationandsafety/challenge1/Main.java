package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge1;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        int numberOfThreads = 100;

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(warehouse, "Customer-" + (i + 1)).start();
        }
    }
}
