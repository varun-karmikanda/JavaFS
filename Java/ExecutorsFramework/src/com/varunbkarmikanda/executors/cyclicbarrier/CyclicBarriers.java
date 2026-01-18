package com.varunbkarmikanda.executors.cyclicbarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarriers {
    public static void main(String[] args) {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);

        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));

        System.out.println("Main");

        executorService.shutdown();

    }
}

class DependentService implements Callable<String>{

    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started...");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at a barrier");
        barrier.await();
        return "Varun";
    }
}