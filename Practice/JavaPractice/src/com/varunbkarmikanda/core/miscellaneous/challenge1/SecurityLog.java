package com.varunbkarmikanda.core.miscellaneous.challenge1;

import java.time.LocalDateTime;

public class SecurityLog {

    private final String event;

    private LocalDateTime timestamp;

    public SecurityLog(String event, LocalDateTime timestamp){
        this.event = event;
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SecurityLog{" +
                "\n\tevent=" + event + "," +
                "\n\ttimestamp=" + timestamp +
                "\n}";
    }
}
