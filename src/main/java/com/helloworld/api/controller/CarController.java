package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")

public class CarController {

    @PostMapping
    public void create(@RequestBody PersonDTO req) {
        System.out.println(req);
    }
}
