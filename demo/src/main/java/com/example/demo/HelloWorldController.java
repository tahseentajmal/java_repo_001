package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    @GetMapping(value = "Hello")
    public String getMethodName() {
        return "Hello Spring One !";
    }
    
}
