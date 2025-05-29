package com.myapp.designpatterns.service;

public class NotificationService {
    public void sendOTP(String medium) {
        switch (medium) {
            case "email":
                System.out.println("email notification is sent");
                break;
            case "mobile":
                System.out.println("mobile notification is sent");
                break;
            default:
                System.out.println("notification muted");
        }
    }
}
