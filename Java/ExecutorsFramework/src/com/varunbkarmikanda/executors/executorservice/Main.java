package com.varunbkarmikanda.executors.executorservice;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> System.out.println("varun"), "success");

        System.out.println(future.get());

        executorService.shutdown();
    }
}
