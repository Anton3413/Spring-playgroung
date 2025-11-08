package com.anton3413;


import com.anton3413.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-definition.xml");

        Employee employee = context.getBean("employee1", Employee.class);
        Employee employee1 = context.getBean("employee1", Employee.class);
        Employee employee2 = context.getBean("employee1", Employee.class);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
