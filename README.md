# 🚀 Real-Time Trading Backend System

A backend application built with **Spring Boot** to manage user trades, store them in a database, and calculate balances through REST APIs.

This project demonstrates practical backend development skills including:
- REST API design
- Spring Boot application structure
- Spring Data JPA integration
- H2 in-memory database usage
- layered architecture for clean code organization

---

## 📌 Features

- Create a trade for a user
- Fetch all trades for a specific user
- Calculate total user balance
- Store trade data using JPA
- Structured package design:
    - `controller`
    - `model`
    - `repository`
    - `service`
    - `kafka`

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## 📂 Project Structure

```bash
src/main/java/com/example/tradingsystem
│
├── controller
│   └── TradeController.java
├── kafka
│   └── KafkaProducerService.java
├── model
│   └── Trade.java
├── repository
│   └── TradeRepository.java
├── service
└── TradingSystemApplication.javagit 
