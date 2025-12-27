package com.varunbkarmikanda.interfaces.test;

public interface Animal {

//    public static final int MAX_AGE = 150;
    int MAX_AGE = 150;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is an Animal interface!");
    }

}
