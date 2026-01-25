package com.varunbkarmikanda.multithreading.interthreadcomm.challenge5;

import java.util.concurrent.Semaphore;

public class Requests {
    public static void main(String[] args) {
        int numberOfRequests = 10;

        final Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i <= numberOfRequests; i++) {
            new Thread(new DatabasePool(semaphore), "SERVER-" + i).start();
        }
    }
}
