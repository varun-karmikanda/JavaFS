package com.varunbkarmikanda.executors.countdownlatch;

import java.util.concurrent.*;

public class CountDownLatches {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

//        for (int i = 0; i < numberOfServices; i++) {
//            new Thread(new DependentService(latch)).start();
//        }
        
        latch.await(3, TimeUnit.SECONDS);

        System.out.println("Main");

        executorService.shutdown();
//        executorService.shutdownNow();
    }
}

class DependentService implements Callable<String>{

    public final CountDownLatch latch;

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " service started...");
        } finally {
            latch.countDown();
        }
        return "Varun";
    }
}

//class DependentService implements Runnable{
//
//    public final CountDownLatch latch;
//
//    public DependentService(CountDownLatch latch){
//        this.latch = latch;
//    }
//
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(5000);
//            System.out.println(Thread.currentThread().getName() + " started...");
//        } catch (Exception e){
//            System.out.println(e);
//        } finally {
//            latch.countDown();
//        }
//    }
//}
