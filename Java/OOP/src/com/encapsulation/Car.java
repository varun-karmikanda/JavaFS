package com.encapsulation;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int year;
    private int speed;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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
