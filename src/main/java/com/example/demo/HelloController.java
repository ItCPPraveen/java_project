package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/description")
    public String description() {
        return "I am a frontend developer with a passion for Software Engineering. I have 6 months of internship experience as UI developer. My journey has been guided by an insatiable curiosity and a desire to continuously learn and grow.";
    }
}