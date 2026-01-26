package com.varunbkarmikanda.multithreading.esandconcurrency.challenge4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Port {
    public static void main(String[] args) {

        int numberOfThreads = 10;
        String ip = "127.0.0.1";
        int startPort = 75;
        int endPort = 9999;

        try(ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads)){
            List<Future<Boolean>> results = new ArrayList<>();

            for (int i = startPort; i <= endPort; i++) {
                results.add(executor.submit(new PortScannerTask(ip, i)));
            }

            for (int i = 0; i < results.size(); i++) {
                int portNumber = startPort+i;
                try{
                    if (results.get(i).get()){
                        System.out.println("PORT OPEN: " + portNumber);
                    } else {
                        System.out.println("PORT CLOSED: " + portNumber);
                    }
                } catch (Exception e) {
                    System.out.println("ERROR SCANNING PORT: " + portNumber);
                }

            }

        }

    }
}
