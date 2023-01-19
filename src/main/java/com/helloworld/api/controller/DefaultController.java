package com.helloworld.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    
    @GetMapping
    public String Default () {
        return "This is the main page. I recommend trying a get on /hello. You could also get /api/car to get a list of all cards published, and a post to /api/car to post your car. /n A car needs a 'modelo', 'fabricante', 'dataFabricacao', 'valor' and 'anoModelo'";
    }
}
