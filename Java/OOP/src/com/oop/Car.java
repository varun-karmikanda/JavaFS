package com.oop;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    int speed;

    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed < 0) speed = 0;
    }

    public String toString(){
        return "Car {" +
                "\n\tbrand= " + brand +
                "\n\tmodel= " + model +
                "\n\tcolor= " + color +
                "\n\tyear= " + year +
                "\n\tspeed= " + speed + " km/h" +
                "\n}";
    }
}
