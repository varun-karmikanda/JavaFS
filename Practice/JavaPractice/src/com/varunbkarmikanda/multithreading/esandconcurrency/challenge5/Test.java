package com.varunbkarmikanda.multithreading.esandconcurrency.challenge5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {

        int numberOfThreads = 20;
        String ip = "127.0.0.";
        int startPort = 1;
        int endPort = 254;

        try(ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads)){

            List<Future<String>> results = new ArrayList<>();

            for (int i = startPort; i <= endPort; i++) {
                String targetIP = "127.0.0." + i;
                results.add(executor.submit(new HostCheckTask(targetIP)));
            }

            for (Future<String> result: results){
                try{
                    String status = result.get();
                    if(status != null){
                        System.out.println(">> " + status);
                    }
                } catch (ExecutionException |InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
