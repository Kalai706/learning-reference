package com.learning.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Employee {

    @NonNull  // To make the field manadatory
    private String name;
    @NonNull  // To make the field manadatory
    private String qualification;
    private String yearOfExperience;
}
