package com.varunbkarmikanda.exception.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

    }

    public static void ReadFromFile(){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("Example.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("IOException caught "+ e.getMessage());
        } finally {
            try{
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader "+e.getMessage());
            }
        }
    }


    // This method where we pass the object in try black to the classes that extends AutoClosable can be closed this way after Java 7
    public static void ReadFromFileAutoClose(){

        try (BufferedReader reader = new BufferedReader(new FileReader("Example.txt"))){

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("IOException caught "+ e.getMessage());
        }
    }

}
