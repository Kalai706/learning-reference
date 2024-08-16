package com.learning.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    @GetMapping("/")
    public List<String> getEmployeeList(){

        log.info("request for employee list");
        return Arrays.asList("employee1","employee2","employee3");
    }
}
