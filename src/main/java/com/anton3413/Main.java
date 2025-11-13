package com.anton3413;


import com.anton3413.config.ApplicationConfig;
import com.anton3413.model.Employee;
import com.anton3413.model.User;
import com.anton3413.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        try( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {

            Employee employee = context.getBean("emp", Employee.class);

            System.out.println(employee);
            System.out.println(context.getBean(String.class));

            UserService userService = context.getBean(UserService.class);

            User user = new User("Anton3413",
                    "feowmitr43wdrf","bondar4939242@gmai.com",
                    LocalDate.of(2000,7,6));

            userService.registerUser(user);
        }
    }
}
