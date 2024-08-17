package com.learning.demo.controller;

import com.learning.demo.model.Employee;
import com.learning.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    private final List<Employee> employeeList = new ArrayList<>();

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getEmployeeList(){
        log.info("request for employee list");
        return employeeList;
    }

    @GetMapping("/employeedetail")
    public Employee getEmployeeDetail() {
        log.info("request for employee detail");
        return employeeService.getEmployeeDetails();
    }

    @PostMapping("/")
    public List<Employee> addEmployeeDetail(@RequestBody Employee employee) {
        log.info("request to add employee");
        employeeList.add(employee);
        return employeeList;
    }
}
