package com.recursion;

public class Factorial {
    // RECURSION: Method that calls itself
    public static void main(String[] args) {
        int i = 5;
        int res = factorial(i);
        if(res == -1){
            System.out.println("Factorial not defined for negative numbers!");
        } else {
            System.out.println(i + "! = " + res);
        }
    }

    public static int factorial(int n){
        if (n < 0) return -1;
        if(n == 0 || n ==1) return 1;
//        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

//    public static int factorial(int n){
//        int fact = 1;
//        for (int i = 1; i <= n; i++){
//            fact *= i;
//        }
//        return fact;
//    }
}
