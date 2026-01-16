package com.varunbkarmikanda.executors.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IsTerminated {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer> submit = executorService.submit(() -> 6 + 7);

        System.out.println(submit.get());

        executorService.shutdown();

        Thread.sleep(1);

        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}
