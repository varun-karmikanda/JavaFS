package com.varunbkarmikanda.oop.pillars.inheritance.human;

public class Parent extends GrandParent {

    public Parent(String name, int age){
        super(name, age);
        System.out.println("Parent constructor called.");
    }

    public void parentMethod(){
        System.out.println("parentMethod called!");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "\n\tname=" + getName() + "," +
                "\n\tage=" + getAge() + "," +
                "\n\thasSuperPowers=" + getHasSuperPowers() + "," +
                "\n}";
    }

}
