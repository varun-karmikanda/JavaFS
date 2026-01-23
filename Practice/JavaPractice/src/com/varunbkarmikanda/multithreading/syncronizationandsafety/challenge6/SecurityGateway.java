package com.varunbkarmikanda.multithreading.syncronizationandsafety.challenge6;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SecurityGateway {

//    public static List<String> backList = new ArrayList<>();
    public static List<String> backList = new CopyOnWriteArrayList<>(); // Thread safe

    public void startSimulation(){
        backList.add("192.168.1.1");
        backList.add("10.0.0.5");
        backList.add("168.72.0.18");

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                backList.forEach(ip -> {

                    System.out.println(Thread.currentThread().getName() + " | IP: "+ ip);

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Reader-Thread").start();

        new Thread(() -> {
            try {
                String ip = "172.16.0.1";
                Thread.sleep(500);
                backList.add(ip);
                System.out.println(Thread.currentThread().getName() + " | " + ip + " backlisted");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Admin").start();
    }

    public static void main(String[] args) {
        new SecurityGateway().startSimulation();
    }
}
