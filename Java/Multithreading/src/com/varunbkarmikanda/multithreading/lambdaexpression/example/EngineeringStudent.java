package com.varunbkarmikanda.multithreading.lambdaexpression.example;

public class EngineeringStudent implements Student{
    @Override
    public String getDetails(String name) {
        return name + " is an Engineering student.";
    }
}
