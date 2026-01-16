package com.varunbkarmikanda.executors.executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAny {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        try {
            Integer i = executorService.invokeAny(list, 1, TimeUnit.SECONDS);
            System.out.println(i);
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        } catch (TimeoutException e) {
            System.out.println(e);
        }

        executorService.shutdown();
    }
}
