package com.varunbkarmikanda.core.exceptionhandling.challenge2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class LogWriter {

    public void logTransaction(String message){


        URL url = LogWriter.class.getResource("");

        File file = new File(url.getPath(), "log.txt");

//        try (FileWriter fw = new FileWriter("src/com/varunbkarmikanda/core/exceptionhandling/challenge2/log.txt, true")){}
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write(message + "\n");
            System.out.println("Log successfully written to the file");
        } catch (IOException e){
            System.out.println("IOException caught: " +e.getMessage());
        }

    }

}
