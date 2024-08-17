package com.learning.demo.controller;

import com.learning.demo.model.Employee;
import com.learning.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<String> getEmployeeList(){
        log.info("request for employee list");
        return Arrays.asList("employee1","employee2","employee3");
    }

    @GetMapping("/employeedetail")
    public Employee getEmployeeDetail() {
        log.info("request for employee detail");
        return employeeService.getEmployeeDetails();
    }
}
