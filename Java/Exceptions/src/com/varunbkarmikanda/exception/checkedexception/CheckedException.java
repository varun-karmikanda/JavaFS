package com.varunbkarmikanda.exception.checkedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader =  new FileReader("file.txt");

//        try {
//            FileReader fileReader =  new FileReader("file.txt");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
