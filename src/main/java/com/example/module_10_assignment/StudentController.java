package com.example.module_10_assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/info")
    public String info() {
        return "Full Name: Raisul Islam Niloy<br>" +
                "Course: Backend Web Development with Java & SpringBoot<br>" +
                "Date: Feb 11, 2026<br>" +
                "Hello, fellow developers!";
    }

    @GetMapping("/goal")
    public String goal() {
        return "My goal is to strengthen my backend development skills by building <br> scalable, secure, and well-structured REST APIs using Spring Boot.";
    }

    @GetMapping("/learning-summary")
    public String learningSummary() {
        return "In Module 10, I learned the core fundamentals of Spring Boot, <br> including the differences between Spring and Spring Boot, how auto-configuration works internally, and the role of starter dependencies. <br>I also understood how to configure applications using application.properties, generate projects using Spring Initializr, analyze the project structure, <br>use the @SpringBootApplication annotation, and run applications using Maven commands.";
    }

    @GetMapping("/review")
    public String review() {
        return "Projects created so far: 3<br>" +
                "Review: The last project helped me understand REST architecture and controller mapping. <br>" +
                "Suggestion: More real-world examples and database integration would improve the learning experience.";
    }
}
