package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge4;

public class DatabaseMonitor implements ServiceTask, Runnable{
    @Override
    public void execute() {
        try {
            System.out.println("[DB] Executing Database task...");
            Thread.sleep(10000);
            System.out.println("[DB] Connection successful");
        } catch (InterruptedException e) {
            System.out.println("[DB] Connection interrupted");
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        execute();
    }
}
