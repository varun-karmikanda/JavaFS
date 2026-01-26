package com.varunbkarmikanda.multithreading.esandconcurrency.challenge4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

public class PortScannerTask implements Callable<Boolean> {

    private final String ip;

    private final int port;

    public PortScannerTask(String ip, int port){
        this.ip = ip;
        this.port = port;
    }


    @Override
    public Boolean call()  {
        try(Socket socket = new Socket()){
            socket.connect(new InetSocketAddress(ip, port), 300);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
