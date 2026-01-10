package com.varunbkarmikanda.core.oops.challenge9;

public interface FuelEngine {

    String fuelType = "Petrol";

    default void start(){
        System.out.println("Combustion engine roaring!!");
    }

    default String fuelType(){
        return "Uses " + fuelType;
    }

}
