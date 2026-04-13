package com.SimpsonsAPI.demo.simpsonsDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simpsons")
public class SimpsonsController {

    private final SimpsonsService simpsonsService;

    public SimpsonsController(SimpsonsService simpsonService){
        this.simpsonsService = simpsonService;
    }

    @GetMapping("/quote")
    public SimpsonsResponse getQuote() {
        return simpsonsService.getSimpsonsQuote();
    }
}

