package com.varunbkarmikanda.multithreading.basics.challenge1;

public class LogWatcher implements Runnable{

    private final String serverName;

    public LogWatcher(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void run() {
        System.out.printf("[%s] [START] Monitoring logs for: %s%n", Thread.currentThread().getName(), serverName);
        System.out.printf("[%s] [INFO] %s is healthy.%n", Thread.currentThread().getName(), serverName);
    }
}
