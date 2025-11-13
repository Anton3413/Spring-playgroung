package com.anton3413.service;


import com.anton3413.event.UserRegisteredEvent;
import com.anton3413.model.User;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor()
public class UserService {

    ApplicationEventPublisher publisher;


    public void registerUser(User user){

        /// /Some business logic
        publisher.publishEvent(new UserRegisteredEvent(user.getUsername()));
    }
}
