package com.varunbkarmikanda.executors.executorservice;

import java.util.concurrent.*;

public class RunnableCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Runnable runnable = () -> "Varun";        // Not possible as the Runnable Interface has one method that is of void type
        Callable<String> callable = () -> "Varun";

//        Future<?> future = executorService.submit(() -> System.out.println("v"));
        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());

        if(future.isDone()){
            System.out.println("Task is done!");
        }

        executorService.shutdown();
    }

}
