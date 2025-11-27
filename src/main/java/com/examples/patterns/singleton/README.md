# Singleton Design Pattern

The **Singleton** is a creational design pattern that ensures a class has **only one instance** in the entire application and provides a **global access point** to that instance.

---

## 📌 Overview

- Guarantees **exactly one instance** of a class.
- Provides a **global access method** (usually `getInstance()`).
- Controls object creation centrally.
- Often used for **shared resources** like configs, loggers, caches, connection pools, etc.
- Can be implemented as:
    - **Lazy initialization** (created on first use).
    - **Eager initialization** (created at class loading).
    - **Thread-safe** variants (e.g., static holder, synchronized, enum).

---

## 🎯 Motive

In many applications, some components must exist only *once*:

- A single configuration manager for the whole app.
- A single logger writing to a common file.
- A single cache or registry.
- A single connection manager / thread pool coordinator.

If multiple instances are created:

- State can become inconsistent.
- Resources like file handles, DB connections, memory, etc. may be wasted.
- Behavior becomes unpredictable if different parts of the app see different instances.

**The motive of the Singleton pattern is to centralize and control instance creation so that there is exactly one, well-known instance used across the entire application.**

---

## ❗ Problem It Solves

### ✔️ 1. Multiple Instances of a “Global” Object

Without Singleton, code might freely create objects like:

```java
Config config1 = new Config();
Config config2 = new Config();
// Different instances, possibly with different state
```

## 📘 UML Diagram

![img.png](img.png)

---