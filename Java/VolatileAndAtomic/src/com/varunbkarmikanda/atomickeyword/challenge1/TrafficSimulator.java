package com.varunbkarmikanda.atomickeyword.challenge1;

import java.util.concurrent.atomic.AtomicLong;

public class TrafficSimulator implements Runnable{

    private AtomicLong tracker;

    private int packetCount;

    public TrafficSimulator(AtomicLong tracker, int packetCount){
        this.tracker = tracker;
        this.packetCount = packetCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= packetCount; i++) {
            tracker.addAndGet(512);
        }
    }
}
