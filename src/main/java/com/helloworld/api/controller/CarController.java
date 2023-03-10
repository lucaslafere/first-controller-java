package com.helloworld.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.helloworld.api.dto.CarDTO;
import com.helloworld.api.model.Car;
import com.helloworld.api.repository.CarRepository;

@RestController
@RequestMapping("/api/car")

public class CarController {

    @Autowired
    private CarRepository repository;


    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        repository.save(new Car(req));
        System.out.println(req);
    }
}
