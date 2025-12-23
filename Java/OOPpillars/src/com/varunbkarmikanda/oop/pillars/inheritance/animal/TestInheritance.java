package com.varunbkarmikanda.oop.pillars.inheritance.animal;

public class TestInheritance {

    // Hierarchical inheritance

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dawg");
        dog.setAge(3);
        dog.eat();
        dog.sayHello();
        System.out.println(dog);
    }
}
