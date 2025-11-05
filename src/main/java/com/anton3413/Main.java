package com.anton3413;


import com.anton3413.model.Employee;
import com.anton3413.model.Employer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.anton3413.config");

       var obj = context.getBean(Employee.class);

        var obj2 = context.getBean(Employer.class);

        System.out.println("df");
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        System.out.println(obj.getEmployees());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        System.out.println(context.getBean(Employee.class));


        System.out.println("Hello from Spring!");
    }
}
