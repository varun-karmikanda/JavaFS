package com.varunbkarmikanda.oop.pillars.abstraction;

public abstract class Animal {

    private String name;

    private int age;

    private boolean hasSuperPowers;

    // Abstract class constructor visibility is protected as constructors of abstract classes can only be called in constructors of the subclasses
    // Basically only the extended/child class can only access the constructors (same for the properties getter & setter)
    protected Animal(){
        this.hasSuperPowers = false;
    }

    // Abstract class can have both abstract methods and concrete methods(Methods with definition is concrete methods)

    public abstract void sayHello();

    public void sleep(){
        System.out.println("zzz...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
