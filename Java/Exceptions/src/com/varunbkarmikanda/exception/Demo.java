package com.varunbkarmikanda.exception;

public class Demo extends Object{

    // All classes extends Object class by default
    // This has toString() method by default

    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40};
        int[] denominator = {10, 2, 0, 7};
        for (int i = 0;i< numerators.length;i++){
            System.out.println(divide(numerators[i], denominator[i]));
        }
        System.out.println("Good job!");
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
