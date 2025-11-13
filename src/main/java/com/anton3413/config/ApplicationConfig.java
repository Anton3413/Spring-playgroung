package com.anton3413.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.anton3413")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {


    @Bean()
    String getString(){
        return "Anton";
    }
}
