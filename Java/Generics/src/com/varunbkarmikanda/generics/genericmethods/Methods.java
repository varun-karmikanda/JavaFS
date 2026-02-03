package com.varunbkarmikanda.generics.genericmethods;

public class Methods {

    public static void main(String[] args){
        Methods methods = new Methods();

        Integer[] intArray = {51, 63, 95, 67};
        String[] stringArray = {"Varun", "B", "Karmikanda"};

        methods.printArray(intArray);
        methods.printArray(stringArray);

    }


    public <T> void printArray(T[] array){
        for (T element: array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
