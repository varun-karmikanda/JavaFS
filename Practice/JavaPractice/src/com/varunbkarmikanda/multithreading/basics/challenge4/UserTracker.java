package com.varunbkarmikanda.multithreading.basics.challenge4;

import java.util.concurrent.atomic.AtomicInteger;

public class UserTracker {

    private AtomicInteger activeUsers = new AtomicInteger(0);

    public int getActiveUsers() {
        return activeUsers.get();
    }

    public void increment(){
        activeUsers.incrementAndGet();
    }
}
