package com.anton3413.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String username;
    private String password;
    private String email;
    private LocalDate birthDate;

}
