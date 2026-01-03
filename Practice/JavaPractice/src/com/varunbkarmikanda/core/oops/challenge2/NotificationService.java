package com.varunbkarmikanda.core.oops.challenge2;

public class NotificationService {

    public String sendNotification(String message){
        return "ALERT: [" +message+ "]";
    }

    public String sendNotification(String message, int priority){
        return "PRIORITY[" +priority+ "] | ALERT: [" +message+ "]";
    }

    public String[] sendNotification(String[] messages){

        int messagesLength = messages.length;

        String[] notifications = new String[messagesLength];

        for (int i = 0; i < messagesLength; i++) {
            notifications[i] = sendNotification(messages[i]);
        }
        return notifications;
    }
}
