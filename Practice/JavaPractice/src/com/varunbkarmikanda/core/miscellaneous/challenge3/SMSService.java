package com.varunbkarmikanda.core.miscellaneous.challenge3;

public class SMSService implements MessageService{

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+message);
    }
}
