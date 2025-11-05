package com.anton3413.config;


import com.anton3413.model.Employee;
import com.anton3413.model.Employer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.anton3413")
@Configuration
public class BeanConfiguration {


    @Bean
    Employer getEmployer() {
        return new  Employer();
    }
}
