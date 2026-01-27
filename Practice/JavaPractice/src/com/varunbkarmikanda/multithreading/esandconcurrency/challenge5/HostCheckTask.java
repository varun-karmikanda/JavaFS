package com.varunbkarmikanda.multithreading.esandconcurrency.challenge5;

import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.Callable;

public class HostCheckTask implements Callable<String> {

    private String ip;

    public HostCheckTask(String ip){
        this.ip = ip;
    }

    @Override
    public String call() {
        try{
            if(InetAddress.getByName(ip).isReachable(500)){
                return ip + " is UP";
            }
        } catch (RuntimeException | IOException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
