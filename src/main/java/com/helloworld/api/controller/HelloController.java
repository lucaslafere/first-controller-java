package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController;
@RequestMapping'("/hello")
public class HelloController {
    
    @GetMapping   
    public String HelloWorld () {
        
        return "Hello world!";
    }
}
