package com.varunbkarmikanda.multithreading.lifecycleandstate.challenge4;

public class MonitorManager {
    public void inspectThread(Thread targetThread) {
        int checks = 0;
        try {
            while( targetThread.isAlive()){
                Thread.State state = targetThread.getState();
                System.out.println("[MANAGER] Checking status: " + state);

                if(state == Thread.State.TIMED_WAITING){
                    checks++;
                    System.out.println("[MANGER] Thread idling.. Status OK (Check " + checks + "/3)");
                }

                if(checks >= 3){
                    System.out.println("[MANAGER] System idle for too long! Terminating..");
                    targetThread.interrupt();
                    break;
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        DatabaseMonitor dbTask = new DatabaseMonitor();
        Thread dbWorkerThread = new Thread(dbTask, "DB-Worker");

        dbWorkerThread.start();

        MonitorManager manager = new MonitorManager();
        manager.inspectThread(dbWorkerThread);
    }
}
