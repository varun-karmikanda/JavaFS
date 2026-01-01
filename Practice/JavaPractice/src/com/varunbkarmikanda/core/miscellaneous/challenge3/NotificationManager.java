package com.varunbkarmikanda.core.miscellaneous.challenge3;

public class NotificationManager {

    public void processAlert(MessageService service, String message){
        service.send(message);
    }
}
