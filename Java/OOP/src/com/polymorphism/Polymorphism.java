package com.polymorphism;

public class Polymorphism {

    // POLYMORPHISM: Treats the object of the subclass as the instance/reference of the super class
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
    }
}
