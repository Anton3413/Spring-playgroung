package com.anton3413.model;


import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@ToString
@EqualsAndHashCode
public class Employee {

    public Employee(long salary, String name, List<String> strings, Integer age) {
        this.salary = salary;
        this.name = name;
        this.strings = strings;
        this.age = age;
    }

    public Employee() {
    }

    private long salary;

    private String name;

    private List<String> strings;

    private Integer age;

}
