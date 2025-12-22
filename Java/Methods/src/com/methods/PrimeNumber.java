package com.methods;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(6754));
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int n){
        int res = 0;
        for (int i = 1;i < n / 2;i++){
            if(n % i == 0) res++;
        }
        return res == 1;
    }
}
