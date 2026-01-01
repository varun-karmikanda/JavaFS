package com.varunbkarmikanda.core.miscellaneous.challenge3;

public class WhatsappService implements MessageService{

    @Override
    public void send(String message) {
        System.out.println("Sending Whatsapp message: "+message);
    }
}
