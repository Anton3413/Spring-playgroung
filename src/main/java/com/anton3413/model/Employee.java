package com.anton3413.model;


import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


public class Employee {

    private long salary;

    private String name;

    private List<Employee> employees;

    private Integer age;

}
