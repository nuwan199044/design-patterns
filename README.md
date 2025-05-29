# 🧬 Liskov Substitution Principle – Java Example

This project demonstrates the **Liskov Substitution Principle (LSP)** using a real-world example: a document exporter system in Java.

---

## 📘 What is the Liskov Substitution Principle?

> "Objects of a superclass should be replaceable with objects of its subclasses without breaking the application."

In simpler terms, if `class B` extends `class A`, we should be able to substitute `A` with `B` **without the program crashing or behaving incorrectly**.

---

## 💡 Real-World Use Case: Document Exporter

We have different types of documents:
- Some are **exportable** (PDF, Excel)
- Some are **read-only** (should not be exported)

---

## 🛑 Bad Design (Violates LSP)

```java
public class ReadOnlyDocument extends Document {
    @Override
    public void export() {
        throw new UnsupportedOperationException("Cannot export read-only document");
    }
}

