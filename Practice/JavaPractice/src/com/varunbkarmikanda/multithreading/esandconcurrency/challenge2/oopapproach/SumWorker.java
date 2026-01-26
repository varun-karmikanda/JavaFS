package com.varunbkarmikanda.multithreading.esandconcurrency.challenge2.oopapproach;

import java.util.concurrent.Callable;

public class SumWorker implements Callable<Long> {

    private final long start;

    private final long end;

    public SumWorker(long start, long end){
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + " | Finished range: " + start + "-" + end);
        return sum;
    }
}
