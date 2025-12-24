package com.varunbkarmikanda.oop.pillars.polymorphism.compiletime;

public class Addition {

    // Overloaded methods

    public int add(int a, int b){
        return a+ b;
    }

    public int add(int a, int b, int c){
        return a+ b + c;
    }

    public double add(double a, double b){
        return a+ b;
    }
}
