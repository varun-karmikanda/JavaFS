package com.varunbkarmikanda.exception;

public class Exceptions {

    // A particular case where a generalized case does not work
    // Exception: Event that disrupts the normal flow of the program. It is a object that is thrown at runtime

    // Exception Handling: a way to handle runtime errors so that normal flow of the application can be maintained
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40};
        int[] denominator = {10, 2, 0, 7};
        for (int i = 0;i< 10;i++){
            try{
                System.out.println(divide(numerators[i], denominator[i]));
            } catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good job!");
    }

    public static int divide(int a, int b){
        try{
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
