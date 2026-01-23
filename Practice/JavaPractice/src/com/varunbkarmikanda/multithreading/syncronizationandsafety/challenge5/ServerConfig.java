package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge5;

import java.math.BigInteger;

public class ServerConfig {

    private volatile boolean running = true;

    public void stopServer(){
        this.running = false;
    }

    public boolean isRunning(){
        return this.running;
    }

    public static void main(String[] args) throws InterruptedException {
        ServerConfig server = new ServerConfig();

        new Thread(() -> {
            long count = 0;
                System.out.println(Thread.currentThread().getName() + "  | Server is running!");

                while (server.isRunning()){
                    count++;
                }

                System.out.println(Thread.currentThread().getName() + "  | Shutdown detected at count " + count);
            },
            "T-1").start();

        Thread.sleep(3000);

        server.stopServer();

        System.out.println(Thread.currentThread().getName() + " | Stop signal sent.");

    }
}
