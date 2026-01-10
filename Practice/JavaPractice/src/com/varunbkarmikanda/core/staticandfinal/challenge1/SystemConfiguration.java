package com.varunbkarmikanda.core.staticandfinal.challenge1;

public class SystemConfiguration {

    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306";

    public static int databaseConnectionCount = 0;

    public SystemConfiguration(){
        databaseConnectionCount++;
    }

    public final void showConfig(){
        System.out.println("DATABASE_URL = "+DATABASE_URL);
    }

}
