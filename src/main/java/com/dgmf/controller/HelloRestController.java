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
}
