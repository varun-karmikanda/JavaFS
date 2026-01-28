package com.varunbkarmikanda.volatilekeyword.challenge;

public class ConfigManager {
    private static volatile ServerConfig config = new ServerConfig("https://api.v1.com", 5000);

    public static void main(String[] args) {

        Thread readerTask = new Thread(() -> {
            while (true){
                try{
                    System.out.println(Thread.currentThread().getName() + " | " + config.getURL());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "READER_THREAD");

        Thread writeTask = new Thread(() -> {
            try{
                Thread.sleep(2000);
                config = new ServerConfig("https://api.v2.com", 5000);
                System.out.println(Thread.currentThread().getName() + " | URL changed to: " + config.getURL());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "WRITER_THREAD");

        readerTask.start();
        writeTask.start();
    }
}
