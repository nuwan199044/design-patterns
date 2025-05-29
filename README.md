# 🔓 Open/Closed Principle – Java Example

This project demonstrates the **Open/Closed Principle (OCP)** using a real-world payment processing system in Java.

---

## 📘 What is the Open/Closed Principle?

> **"Software entities (classes, modules, functions) should be open for extension, but closed for modification."**

That means you should be able to **add new features** (extensions) without changing the existing source code (which is risky and error-prone).

---

## 💡 Real-World Use Case: Payment Processing System

In this example, different types of payments (credit card, PayPal, bank transfer) are processed using a flexible design that doesn't require changing the main service logic when adding a new payment type.

---

## 📐 Class Diagram

```plaintext
           +-----------------------+
           |   PaymentProcessor    |  <<interface>>
           +-----------------------+
                     ▲
    ┌────────────────┼────────────────┐
    |                |                |
+----------------+ +----------------+ +---------------------+
| CreditCardPayment | | PayPalPayment   | | BankTransferPayment |
+----------------+ +----------------+ +---------------------+
          ▲
          |
+-------------------+
|  PaymentService   |
|  - process(...)   |
+-------------------+

