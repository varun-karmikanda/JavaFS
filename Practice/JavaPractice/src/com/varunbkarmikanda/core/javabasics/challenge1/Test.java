package com.varunbkarmikanda.core.javabasics.challenge1;

public class Test {
    public static void main(String[] args) {

        Electronics item = new Electronics("PC", 5, 1_00_000, true, EnergyRating.A);
        System.out.println(item);
        System.out.println("TOTAL = "+ item.totalCost());

    }
}
