package com.dgmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    // Expose "/" Endpoint | Return "Hello World"
    @GetMapping("/")
    public String hello() {
        return "Hello World !";
    }

    // Expose "/workout" Endpoint | Return "Run a Hard 5k !"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a Hard 5k !";
    }

    // Expose "/fortune" Endpoint | Return "Today is your Lucky Day !"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your Lucky Day !";
    }
}
