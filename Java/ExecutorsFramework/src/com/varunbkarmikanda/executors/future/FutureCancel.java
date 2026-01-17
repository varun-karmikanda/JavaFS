package com.varunbkarmikanda.executors.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancel {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred: " + e);
            }
            System.out.println("67");
            return 67;
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred: " + e);
        }

//        future.cancel(true);
        future.cancel(false);

        System.out.println(future.isCancelled());
        System.out.println(future.isDone());

        executorService.shutdown();
    }
}
