package com.oop;

public class CarTest {
    public static void main(String[] args) {
        // Way of programming where we deal with classes and objects

        // Properties and Behaviour

        Car car = new Car();
        car.brand = "BMW";
        car.model = "7 series";
        car.color = "Black";
        car.year = 2025;
        car.speed = 333;

        System.out.println(car.toString());

        car.accelerate(10);

        System.out.println(car.toString());
    }
}
