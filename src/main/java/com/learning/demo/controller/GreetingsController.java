package com.learning.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String greeting(){
        return "Experience is the name everyone gives to their mistakes. – Oscar Wilde";
    }
}
