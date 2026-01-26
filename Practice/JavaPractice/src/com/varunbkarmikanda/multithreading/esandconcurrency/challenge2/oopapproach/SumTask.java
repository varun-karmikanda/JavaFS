package com.varunbkarmikanda.multithreading.esandconcurrency.challenge2.oopapproach;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class SumTask {
    public static void main(String[] args) {
        int numberOfThreads = 2;

        try(ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads)) {
            SumWorker task1 = new SumWorker(0, 500_000);
            SumWorker task2 = new SumWorker(500_001, 1_000_000);

            List<Future<Long>> results = executor.invokeAll(Arrays.asList(task1, task2));

            long totalSum = 0;
            for (Future<Long> res: results){
                totalSum += res.get();
            }
            System.out.println(Thread.currentThread().getName() + " | Total sum: " + totalSum);

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
