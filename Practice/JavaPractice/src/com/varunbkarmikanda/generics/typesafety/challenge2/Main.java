package com.varunbkarmikanda.generics.typesafety.challenge2;

public class Main {
    public static void main(String[] args) {
        Coordinate<String, Integer> coordinate = new Coordinate<>("Varun", 63);
        System.out.println("Coordinates before swap: ");
        System.out.println(coordinate);
        System.out.println("Coordinates after swap : ");
        System.out.println(coordinate.swap());
    }
}
