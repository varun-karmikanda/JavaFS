package com.varunbkarmikanda.core.miscellaneous.challenge2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfigLoader {

    public void loadConfig(String path){
        Scanner reader = null;
        try{
            File file = new File(path);
            reader = new Scanner(file);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e);
            loadDefaultConfig();
        } finally {
            if(reader != null){
                reader.close();
            }
        }
    }

    public void loadDefaultConfig(){
        System.out.println("FALLBACK!");
    }
}
