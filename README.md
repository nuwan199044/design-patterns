# 📤 Interface Segregation Principle – Java Example

This project demonstrates the **Interface Segregation Principle (ISP)** from the SOLID design principles using a real-world printer system.

---

## 📘 What is the Interface Segregation Principle?

> "Clients should not be forced to depend on methods they do not use."

It means it's better to have **multiple small, specific interfaces** than a large, bloated one that forces classes to implement irrelevant methods.

---

## 💡 Real-World Use Case: Printer System

Imagine we have different types of devices:

- A **Basic Printer** that only prints
- An **Advanced Printer** that supports printing, scanning, and faxing

---

## 🛑 Bad Design (Violates ISP)

```java
public interface MultiFunctionDevice {
    void print(String content);
    void scan(String content);
    void fax(String content);
}
