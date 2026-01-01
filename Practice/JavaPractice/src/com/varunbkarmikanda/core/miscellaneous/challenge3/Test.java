package com.varunbkarmikanda.core.miscellaneous.challenge3;

public class Test {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();

        MessageService email = new EmailService();
        MessageService sms = new SMSService();

        manager.processAlert(email, "Test message [Email]");
        manager.processAlert(sms, "Test message [SMS]");

        MessageService whatsapp = new WhatsappService();
        manager.processAlert(whatsapp, "Test message [Whatsapp]");
    }
}
