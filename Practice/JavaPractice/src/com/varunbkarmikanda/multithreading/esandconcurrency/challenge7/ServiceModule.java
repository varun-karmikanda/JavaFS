package com.varunbkarmikanda.multithreading.esandconcurrency.challenge7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class ServiceModule implements Runnable{

    private String serviceName;

    private CyclicBarrier barrier;

    public ServiceModule(String serviceName, CyclicBarrier barrier){
        this.serviceName = serviceName;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " | LOADING...");
            int randomTime = ThreadLocalRandom.current().nextInt(2000, 4001);
            Thread.sleep(randomTime);
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " | LIVE!!" );
            System.out.println(Thread.currentThread().getName() + " | TIME: " + randomTime);
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
        }
    }
}
