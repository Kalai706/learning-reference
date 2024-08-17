package com.learning.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RecollectJavaBasic {

    private final List<String> student = Arrays.asList("kalai","vani");
    private final List<String> student1 = new ArrayList<>(Arrays.asList("kalai","vani"));
    private final String[] student2 = {"kalai","vani"};

    private ArrayList<String> convertArrayIntoList(){
        return new ArrayList<>(Arrays.asList(student2));
    }

}
