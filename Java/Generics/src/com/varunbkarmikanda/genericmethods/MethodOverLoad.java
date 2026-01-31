package com.varunbkarmikanda.genericmethods;

public class MethodOverLoad {

    public static void main(String[] args) {
        MethodOverLoad method = new MethodOverLoad();

        method.display(51);
        method.display("Varun");
        method.display(67.51);
    }

    public <T> void display(T element){
        System.out.println("GENERIC DISPLAY: " + element);
    }

    public void display(Integer element){
        System.out.println("INTEGER DISPLAY: " + element);
    }
}
