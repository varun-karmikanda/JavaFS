package com.encapsulation;

public class Encapsulation {

    // ENCAPSULATION: Bundling of data & methods into a single unit
    // Data Hiding: This helps up hide the data
    // In order to access the data we need to use getters and setters

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setColor("Black");
        car.setSpeed(333);
        System.out.println(car.toString());
    }
}
