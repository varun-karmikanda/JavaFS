package com.varunbkarmikanda.multithreading.basics.challenge1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> servers = List.of("Auth-Server", "DB-Cluster", "UI-Gateway");

        for (String server: servers){
            Thread t = new Thread(new LogWatcher(server), "Watcher-" + server);
            t.start();
        }
    }
}
