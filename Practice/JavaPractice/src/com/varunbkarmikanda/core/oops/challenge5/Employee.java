package com.varunbkarmikanda.core.oops.challenge5;

public class Employee {

    private String id;

    private String name;

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n\tid=" + id + "," +
                "\n\tname=" + name + "," +
                "\n}";
    }
}
