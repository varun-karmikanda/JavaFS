package com.varunbkarmikanda.exception.finallykeyword;

public class Finally {
    public static void main(String[] args) {
        System.out.println(divide(63, 0));
        System.out.println(divide(63, 3));
    }

    public static int divide(int a, int b){
        try{
            return a / b;
        } catch (Exception e) {
            return -1;
        } finally {
            System.out.println("Finally block!");
        }
    }
}
