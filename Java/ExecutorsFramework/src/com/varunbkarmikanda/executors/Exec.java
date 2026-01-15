package com.varunbkarmikanda.executors;

public class Exec {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();        // 1 Jan 1970
        Thread[] threads = new Thread[9];
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            threads[i-1] = new Thread(() ->{
                long result = factorial(finalI);
            System.out.println(result);
            });
            threads[i-1].start();
        }

        for (Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }

    public static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i= 1;i <= n;i++){
            result *= i;
        }
        return result;
    }
}
