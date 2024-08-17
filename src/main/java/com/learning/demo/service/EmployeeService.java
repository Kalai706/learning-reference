package com.learning.demo.service;

import com.learning.demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployeeDetails(){
        return Employee.builder()
                .name("kalai")
                .qualification("Btech")
//                .yearOfExperience("13")
                .build();
    }
}
