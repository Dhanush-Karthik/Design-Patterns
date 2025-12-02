# Adapter Design Pattern

The **Adapter** is a structural design pattern that allows **incompatible interfaces to work together**. It acts as a **bridge** between a client expecting one kind of interface and an existing class (the *adaptee*) offering another.

---

## 📌 Overview

- Allows objects with **incompatible interfaces** to collaborate.
- Wraps a legacy or third-party class and **converts its interface** into one that the client expects.
- Promotes **reusability** of existing code without modifying it.
- Often used when introducing **new code into old systems**, or when integrating **third-party libraries**.
- Also known as:
    - **Wrapper** pattern
    - **Translator** pattern

---

## 🎯 Motive

Real-world systems evolve. Clients may expect an interface that older or external systems do not adhere to.

Examples:

- Client expects `processPayment()`, but legacy code has `makePayment()`.
- Client wants JSON output, but legacy service returns XML.
- New business layer uses modern DTOs, but existing service uses old models.

Instead of rewriting the legacy code — which may be risky or forbidden — we create an **Adapter** that translates calls between the two incompatible interfaces.

---

## ❗ Problem It Solves

### ✔️ 1. Incompatible Interfaces

Without adapters, you might have something like:

```java
LegacyService legacy = new LegacyService();
legacy.serviceMethod();  // cannot be called directly by the client expecting adapterMethod()
```

📘 UML Diagram

![img.png](img.png)