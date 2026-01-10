package com.varunbkarmikanda.core.staticandfinal.challenge1;

public class Test {
    public static void main(String[] args) {
        DatabaseClient databaseClient1 = new DatabaseClient();
        DatabaseClient databaseClient2 = new DatabaseClient();
        DatabaseClient databaseClient3 = new DatabaseClient();

        System.out.println("Total DB connections: " + SystemConfiguration.databaseConnectionCount);

        databaseClient1.showConfig();

        databaseClient1.connect();

    }
}
