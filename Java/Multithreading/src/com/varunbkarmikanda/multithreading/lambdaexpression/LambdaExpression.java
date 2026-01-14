package com.varunbkarmikanda.multithreading.lambdaexpression;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            System.out.println("Lambda");
//        };
//
//        Thread t = new Thread(runnable);
//        t.start();

//        Runnable runnable = () -> System.out.println("Lambda");
//        Thread t = new Thread();
//        t.start();

//        Thread t = new Thread(() -> System.out.println("Lambda"));
//        t.start();

        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Lambda");
            }
        });

        t.start();


    }
}
