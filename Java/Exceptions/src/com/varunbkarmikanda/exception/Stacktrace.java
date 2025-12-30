package com.varunbkarmikanda.exception;

public class Stacktrace {

    // Stacktrace traces the error step by step

    public static void main(String[] args) {
        try{
            level1();
        } catch (Exception e) {
//            StackTraceElement[] stackTraceElements = e.getStackTrace();
//            for (int i=0;i< stackTraceElements.length; i++){
//                System.out.println(stackTraceElements[i]);
//            }
            e.printStackTrace();
        }
    }

    public static void level1(){
        level2();
    }

    public static void level2(){
        level3();
    }

    public static void level3(){
        int[] arr = new int[5];
        arr[5] = 10;
    }
}
