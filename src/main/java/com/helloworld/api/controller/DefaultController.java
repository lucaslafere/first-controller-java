package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    
    @GetMapping
    public String Default () {
        return "This is the main page. I recommend trying a get on /hello or on /api/car";
    }
}
