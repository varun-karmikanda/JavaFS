package com.varunbkarmikanda.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    // Wrapper wraps the primitive datatypes
    // Wrappers basically convert primitive values into objects

    public static void main(String[] args) {
        int num = 10;
        float number = 1.67F;

        List<Integer> list = new ArrayList<>();

        // a is a primitive variable
        // stored in stack
        int num1 = 10;

        // b is a reference variable
        // stored is heap as b is an object
        Integer num2 = 15;
        System.out.println(num2.equals(5));

        boolean hasGraphicsCard = true;
        Boolean hasWaterCooler = false;

        Byte bt = 111;
        Boolean b = true;
        Short s = 1222;
        Integer i = 43543;
        Long l = 211313123L;
        Float f = 57.77F;
        Double d = 63.51;
        Character c = 'v';

        // Boxing (Under the hood Java does this when we use the wrapper class)
        Integer value1 = Integer.valueOf(5);

        // (Auto-boxing) Since Java does this boxing automatically
        Integer value2 = 6;

        // Auto-boxing: Automatic conversion of primitive to object

        // Un-boxing: conversion of Object to primitive value
        int value3 = value1.intValue();

        // (Auto Un-boxing): Automatic conversion of Object to primitive value
        int value4 = value2;

    }
}
