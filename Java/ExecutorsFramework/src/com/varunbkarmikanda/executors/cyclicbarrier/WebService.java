package com.varunbkarmikanda.executors.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebService {
    public static void main(String[] args) {
        int numberOfWebServices = 4;
        CyclicBarrier barrier = new CyclicBarrier(
                numberOfWebServices,
                () -> System.out.println("All subsystems are running. System startup complete")
        );

        Thread webServerThread = new Thread(new SubSystem("Web server", 2000, barrier));
        Thread databaseThread = new Thread(new SubSystem("Database", 4000, barrier));
        Thread cacheThread = new Thread(new SubSystem("Cache", 3000, barrier));
        Thread messageServiceThread = new Thread(new SubSystem("Message service", 3500, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messageServiceThread.start();
    }
}

class SubSystem implements Runnable{

    private final String name;

    private final int initializationTime;

    private final CyclicBarrier barrier;

    public SubSystem(String name, int initializationTime, CyclicBarrier barrier){
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }


    @Override
    public void run() {
        try {
            System.out.println(name + " initialization started!");
            Thread.sleep(initializationTime);
            System.out.println(name + " initialization complete!");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }

    }
}
