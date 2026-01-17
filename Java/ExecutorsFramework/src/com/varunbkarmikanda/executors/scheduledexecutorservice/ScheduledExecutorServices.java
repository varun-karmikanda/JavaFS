package com.varunbkarmikanda.executors.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServices {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

//        scheduler.schedule(
//                () -> {
//                    System.out.println("Task executed after 3 SECOND delay!");
//                },
//                3,
//                TimeUnit.SECONDS
//        );

//        scheduler.shutdown();


        // Need to handle shutdown manually
//        scheduler.scheduleAtFixedRate(
//                () -> {
//                    System.out.println("task executed after every 3 second delay!");
//                },
//                3,
//                3,
//                TimeUnit.SECONDS
//        );
//
//        scheduler.schedule(
//                () -> {
//                    System.out.println("Initiating shutdown!");
//                    scheduler.shutdown();
//                },
//                15,
//                TimeUnit.SECONDS
//        );

        ScheduledFuture<?> scheduledFuture = scheduler.scheduleWithFixedDelay(
                () -> {
                    System.out.println("Task executed after 3 second delay");
                },
                3,
                3,
                TimeUnit.SECONDS
        );

        scheduler.schedule(
                () -> {
                    System.out.println("Initiating shutdown!");
                    scheduler.shutdown();
                },
                15,
                TimeUnit.SECONDS
        );

    }
}
