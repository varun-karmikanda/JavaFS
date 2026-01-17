package com.varunbkarmikanda.executors.future;

import java.util.concurrent.*;

public class FutureGet {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() -> {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
            }
            return 67;
        });
        Integer i = null;
        try{
//            i = future.get();
            i = future.get(1, TimeUnit.SECONDS);
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception occurred: " + e);
        }

        executorService.shutdown();
    }
}
