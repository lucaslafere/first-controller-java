package com.helloworld.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.helloworld.api.dto.PersonDTO;
import com.helloworld.api.repository.CarRepository;

@RestController
@RequestMapping("/api/car")

public class CarController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void create(@RequestBody PersonDTO req) {
        repository.save(req);
    }
}
