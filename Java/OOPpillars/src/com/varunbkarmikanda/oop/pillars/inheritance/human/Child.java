package com.varunbkarmikanda.oop.pillars.inheritance.human;

public class Child extends Parent {

    public Child(String name, int age){
        super(name, age);
        System.out.println("Child constructor called.");
    }

    public void childMethod(){
        System.out.println("childMethod called!");
        super.parentMethod();
    }

    @Override
    public String toString() {
        return "Child{" +
                "\n\tname=" + getName() + "," +
                "\n\tage=" + getAge() + "," +
                "\n\thasSuperPowers=" + getHasSuperPowers() + "," +
                "\n}";
    }

}
