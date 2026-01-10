package com.varunbkarmikanda.core.exceptionhandling.challenge3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();

        try {
            authenticator.login();
        } catch (SecurityException e) {
            System.out.println("Error: "+ e.getMessage());
            System.out.println("Cause: "+e.getCause());
        }

    }


}
