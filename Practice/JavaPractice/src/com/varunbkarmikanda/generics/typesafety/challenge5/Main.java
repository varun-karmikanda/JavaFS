package com.varunbkarmikanda.generics.typesafety.challenge5;

public class Main {
    public static void main(String[] args) {
        DataGuard<Integer> integerDataGuard = new DataGuard<>(67);
        System.out.println(integerDataGuard.isGreaterThan(63));

    }
}
