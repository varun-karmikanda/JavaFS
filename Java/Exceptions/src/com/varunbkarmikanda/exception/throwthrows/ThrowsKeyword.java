package com.varunbkarmikanda.exception.throwthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {

    // throws: make the caller responsible for calling the exception

    public static void main(String[] args) throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("file.txt");
    }
}
