package com.varunbkarmikanda.exception.throwthrows;

import java.io.FileNotFoundException;
import java.util.logging.FileHandler;

public class ThrowKeyword {

    // throw: forcefully send the exception in a try catch block

    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        try{
            FileHandler fileHandler = new FileHandler("file.txt");
        } catch (Exception e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException();
        }
    }
}
