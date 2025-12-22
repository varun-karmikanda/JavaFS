package com.recursion;

public class NaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("SUM = " + sumOfNNaturalNumbers(n));
    }

    public static int sumOfNNaturalNumbers(int n){
        if(n <= 0) return 0;
        return n + sumOfNNaturalNumbers(n - 1);
    }
}
