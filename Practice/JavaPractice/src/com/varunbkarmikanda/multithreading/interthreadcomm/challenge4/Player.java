package com.varunbkarmikanda.multithreading.interthreadcomm.challenge4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player implements Runnable{

    private int loadTime;

    private final CyclicBarrier barrier;

    public Player(int loadTime, CyclicBarrier barrier){
        this.loadTime = loadTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " | Trying to connect!");
            Thread.sleep(loadTime);
            System.out.println(Thread.currentThread().getName() + " | Waiting in the lobby.");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " | Has entered the game world.");
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(Thread.currentThread().getName() + " | Exception: " + e);
            e.printStackTrace();
        }
    }
}
