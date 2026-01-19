package com.varunbkarmikanda.multithreading.basics.challenge2;

import java.util.List;

public class PaymentProcess {
    public static void main(String[] args) {
        List<Integer> transactionIds = List.of(10001, 10002, 10003, 10004, 10005);

//        for (Integer id: transactionIds){
//            new Thread(
//                    () -> {
//                        System.out.println(Thread.currentThread().getName() + " | Processing payment for ID: " + id);
//                        System.out.println(Thread.currentThread().getName() + " | Payment " + id + " success!");
//                    },
//                    "PAY-" + id.toString().substring(2)
//            ).start();
//        }

        transactionIds.forEach(id -> {
            String threadName = "PAY-" + id.toString().substring(2);

            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " | Processing payment for ID: " + id);
                System.out.println(Thread.currentThread().getName() + " | Payment " + id + " success!");
            }, threadName).start();
        });
    }
}
