package com.varunbkarmikanda.core.miscellaneous.challenge3;

public class EmailService implements MessageService{

    @Override
    public void send(String message) {
        System.out.println("Sending Email: "+message);
    }

}
