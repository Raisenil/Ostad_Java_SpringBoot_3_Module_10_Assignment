# Ostad Java SpringBoot 3 - Module 10 Assignment

A Spring Boot 4.0.2 application demonstrating REST API fundamentals and core Spring Boot concepts.

## 📋 Project Overview

This project is part of the **Ostad Java & SpringBoot 3 Backend Web Development** course, specifically Module 10. It showcases the fundamental concepts of Spring Boot, including application configuration, controller mapping, and REST API creation.

**Author:** Raisul Islam Niloy  
**Date:** February 11, 2026  
**Course:** Backend Web Development with Java & SpringBoot

---

## 🎯 Project Goal

To strengthen backend development skills by building scalable, secure, and well-structured REST APIs using Spring Boot.

---

## 📚 Learning Objectives (Module 10)

This module covers the following key concepts:

- Core fundamentals of Spring Boot
- Differences between Spring Framework and Spring Boot
- How auto-configuration works internally
- Role of starter dependencies
- Configuration using `application.properties`
- Generating projects using Spring Initializr
- Analyzing and understanding project structure
- Using the `@SpringBootApplication` annotation
- Running applications using Maven commands

---

## 🛠 Technology Stack

| Technology | Version |
|-----------|---------|
| Java | 21 |
| Spring Boot | 4.0.2 |
| Maven | (via mvnw) |
| Build Tool | Spring Boot Maven Plugin |

### Dependencies

- **spring-boot-starter-webmvc** - Web MVC framework for building REST APIs
- **spring-boot-starter-webmvc-test** - Testing utilities for web layer (test scope)

---

## 📁 Project Structure

```
Ostad_Java_SpringBoot_3_Module_10_Assignment/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/module_10_assignment/
│   │   │       ├── Module10AssignmentApplication.java    (Main entry point)
│   │   │       └── StudentController.java                (REST endpoints)
│   │   └── resources/
│   │       ├── application.properties                    (Configuration)
│   │       ├── static/                                   (Static resources)
│   │       └── templates/                                (View templates)
│   └── test/
│       └── java/.../Module10AssignmentApplicationTests.java
├── target/                                               (Compiled output)
├── pom.xml                                               (Maven configuration)
├── mvnw / mvnw.cmd                                       (Maven wrapper)
└── README.md                                             (This file)
```

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 21 or higher
- Maven 3.6+ (or use the included Maven wrapper)

### Installation & Setup

1. **Clone or download the project:**
   ```bash
   cd D:\Work\Java\Ostad_Java_SpringBoot_3_Module_10_Assignment
   ```

2. **Build the project using Maven wrapper:**
   - **On Windows:**
     ```bash
     mvnw.cmd clean install
     ```
   - **On Linux/Mac:**
     ```bash
     ./mvnw clean install
     ```

3. **Run the application:**
   - **Using Maven:**
     ```bash
     mvnw.cmd spring-boot:run
     ```
   - **Using JAR:**
     ```bash
     java -jar target/Ostad_Java_SpringBoot_3_Module_10_Assignment-0.0.1-SNAPSHOT.jar
     ```

The application will start on `http://localhost:8080` by default.

---

## 🔌 API Endpoints

The application exposes the following REST endpoints through `StudentController`:

### 1. `/info` - Student Information
```
GET http://localhost:8080/info
```
**Response:**
```
Full Name: Raisul Islam Niloy
Course: Backend Web Development with Java & SpringBoot
Date: Feb 11, 2026
Hello, fellow developers!
```

### 2. `/goal` - Learning Goals
```
GET http://localhost:8080/goal
```
**Response:**
```
My goal is to strengthen my backend development skills by building scalable, secure, and well-structured REST APIs using Spring Boot.
```

### 3. `/learning-summary` - Module 10 Learning Summary
```
GET http://localhost:8080/learning-summary
```
**Response:** Detailed summary of Module 10 concepts and learnings

### 4. `/review` - Project Review & Feedback
```
GET http://localhost:8080/review
```
**Response:**
```
Projects created so far: 3
Review: The last project helped me understand REST architecture and controller mapping.
Suggestion: More real-world examples and database integration would improve the learning experience.
```

---

## 📝 Configuration

### Application Properties

File: `src/main/resources/application.properties`

```properties
spring.application.name=Module_10_Assignment
```

You can customize the server port and other settings:

```properties
server.port=8080
spring.application.name=Module_10_Assignment
```

---

## 📂 Key Components

### 1. **Module10AssignmentApplication.java**
Main entry point of the Spring Boot application. Uses the `@SpringBootApplication` annotation which combines:
- `@SpringBootConfiguration`
- `@EnableAutoConfiguration`
- `@ComponentScan`

### 2. **StudentController.java**
REST controller containing four GET endpoints. Uses:
- `@RestController` - Marks the class as a REST controller
- `@GetMapping` - Maps HTTP GET requests to handler methods

---

## 🧪 Testing

Run the test suite:

```bash
mvnw.cmd test
```

Test file: `src/test/java/.../Module10AssignmentApplicationTests.java`

---

## 📊 Learning Progress

| Aspect | Status |
|--------|--------|
| Spring Boot Fundamentals | ✅ Completed |
| REST API Creation | ✅ Completed |
| Project Structure Understanding | ✅ Completed |
| Configuration Management | ✅ Completed |
| Database Integration | ⏳ Future Enhancement |
| Dependency Injection | ⏳ Future Enhancement |

---

## 💡 Key Takeaways

1. **Spring Boot Simplifies Setup** - Auto-configuration eliminates boilerplate configuration
2. **REST Endpoints are Easy** - Simple annotation-based routing with Spring MVC
3. **Starter Dependencies** - Spring Boot starters bundle related dependencies intelligently
4. **Convention over Configuration** - Sensible defaults reduce configuration needs
5. **Maven Integration** - Maven wrapper provides easy build management

---

## 🔮 Future Enhancements

- [ ] Database integration (JPA/Hibernate)
- [ ] Request body handling with DTOs
- [ ] Error handling and exception management
- [ ] Logging implementation
- [ ] Unit and integration tests
- [ ] API documentation with Swagger/SpringDoc
- [ ] Authentication and authorization
- [ ] Multi-module project structure

---

## 🔗 Repository

GitHub Repository: [https://github.com/Raisenil/Ostad_Java_SpringBoot_3_Module_10_Assignment.git](https://github.com/Raisenil/Ostad_Java_SpringBoot_3_Module_10_Assignment.git)

---

