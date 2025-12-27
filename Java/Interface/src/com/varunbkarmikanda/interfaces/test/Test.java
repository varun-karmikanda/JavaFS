package com.varunbkarmikanda.interfaces.test;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.eat();

        System.out.println(Cat.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
        Animal.info();
//        Cat.info();   // static methods accessible only via the interfaces
    }
}
