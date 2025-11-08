package com.anton3413;


import com.anton3413.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-definition.xml");

        Employee employee = context.getBean("emp", Employee.class);

        System.out.println(employee);
    }
}
