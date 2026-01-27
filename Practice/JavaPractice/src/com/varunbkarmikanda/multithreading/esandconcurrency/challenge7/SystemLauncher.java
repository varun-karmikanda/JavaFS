package com.varunbkarmikanda.multithreading.esandconcurrency.challenge7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class SystemLauncher {
    public static void main(String[] args) {
        List<String> systems = Arrays.asList("AUTH", "DATABASE", "CACHE");
        int numberOfSystems = systems.size();

        CyclicBarrier barrier = new CyclicBarrier(
                numberOfSystems,
                () -> System.out.println("SYSTEMS: " + numberOfSystems + "\nALL SYSTEMS READY! STARTING SERVER"));

        systems.forEach((system) -> {
            new Thread(new ServiceModule(system, barrier), system).start();
        });
    }
}
