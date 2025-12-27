package com.varunbkarmikanda.interfaces.animals;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();


        System.out.println(Cat.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        // static method access
        Animal.info();
//        Cat.info();   // static methods accessible only via the interfaces

        // default method access
//        Animal.run();   // default method is accessed via the implementation class objects
        cat.run();
        dog.run();

    }
}
