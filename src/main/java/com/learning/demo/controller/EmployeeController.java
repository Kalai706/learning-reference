package com.learning.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public List<String> getEmployeeList(){
        return Arrays.asList("employee1","employee2","employee3");
    }
}
