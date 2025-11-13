package com.anton3413.model;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@ToString
@EqualsAndHashCode
@Component(value = "emp")
public class Employee {

    public Employee(@Value("2000")long salary, @Value("Anton") String name, @Value("25") Integer age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    private long salary;

    private String name;

    private Integer age;

    @PostConstruct
    private void init(){
        System.out.println("Post-construct method works");
    }
    @PreDestroy
    private void destroy(){
        System.out.println("Pre-destroy method works");
    }

}
