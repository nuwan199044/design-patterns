package com.myapp.designpatterns;

public class NotificationService {
    private final MessageSender sender;

    // Constructor injection (preferred)
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}
