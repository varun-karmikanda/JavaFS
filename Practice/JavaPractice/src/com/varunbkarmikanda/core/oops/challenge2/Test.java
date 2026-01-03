package com.varunbkarmikanda.core.oops.challenge2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String[] messages = {"Hello", "World"};

        NotificationService notificationService = new NotificationService();

        System.out.println(notificationService.sendNotification("Hello, World!"));

        System.out.println(notificationService.sendNotification("Priority message!", 10));

        String[] result = notificationService.sendNotification(messages);
        System.out.println(Arrays.toString(result));
    }
}
