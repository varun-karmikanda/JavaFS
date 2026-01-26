package com.varunbkarmikanda.multithreading.esandconcurrency.challenge2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class SumTask {
    public static void main(String[] args) {
        int numberOfThreads = 2;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        Callable<Long> task1 = () -> {
            long sum = 0;
            for (int i = 1; i <= 500_000; i++) {
                sum += i;
            }
            return sum;
        };

        Callable<Long> task2 = () -> {
            long sum = 0;
            for (int i = 500_001; i <= 1_000_000; i++) {
                sum += i;
            }
            return sum;
        };

        List<Callable<Long>> list = Arrays.asList(task1, task2);

        List<Future<Long>> futures = null;
        try {
            futures = executor.invokeAll(list);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long totalSum = 0;

        for (Future<Long> future: futures){
            try{
                totalSum += future.get();
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Final calculated total sum: " + totalSum);

        executor.shutdown();

    }

}
