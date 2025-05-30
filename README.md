# 📬 Dependency Inversion Principle – Java Example

This project demonstrates the **Dependency Inversion Principle (DIP)** from the SOLID design principles using a real-world notification system in Java.

---

## 📘 What is the Dependency Inversion Principle?

> **"High-level modules should not depend on low-level modules. Both should depend on abstractions."**

It also means:
> "Details should depend on abstractions — not the other way around."

---

## 💡 Real-World Use Case: Notification System

### Scenario:

We want to send notifications to users. Notifications may be sent by:

- Email
- SMS
- Push notification (in the future)

---

## 🛑 Bad Design (Violates DIP)

```java
public class NotificationService {
    private EmailSender sender = new EmailSender();

    public void notifyUser(String message) {
        sender.sendEmail(message);
    }
}

