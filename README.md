# Spring Boot CLI Todo Application

## 📌 Overview
This is a **command-line based Todo application** built using **Spring Boot**.
The application allows users to manage tasks directly from the terminal and
stores data persistently in a **JSON file**.

The project is designed using **clean layered architecture** and demonstrates
how Spring Boot can be used beyond web applications.

---

## ✨ Features
- Add a new task
- Modify an existing task
- Delete a task
- Print all tasks
- Print tasks by status (COMPLETED / PENDING)
- Persistent storage using JSON file
- Command-line interaction
- Graceful exit from application

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Jackson (JSON serialization/deserialization)
- Maven
- Git & GitHub

---

## 🧱 Project Structure
spring-boot-cli-todo
├── data
│ └── data.json
├── src
│ └── main
│ └── java
│ ├── model
│ ├── repository
│ ├── service
│ └── runner
├── pom.xml
└── README.md
