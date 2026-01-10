package com.varunbkarmikanda.core.exceptionhandling.challenge3;

import java.io.IOException;

public class Authenticator {

    private void connectToDatabase() throws IOException {
        throw new IOException("Time out!");
    }

    public void login() throws SecurityException{
        try{
            connectToDatabase();
        } catch (IOException e) {
            throw new SecurityException("Custom exception");
        }
    }

}
