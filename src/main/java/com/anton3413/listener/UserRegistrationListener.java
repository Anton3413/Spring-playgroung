package com.anton3413.listener;

import com.anton3413.event.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationListener {

    private static final String message = "Congratulations, %s you are registered!";

    @EventListener
    public void printWelcomeMessage(UserRegisteredEvent userRegisteredEvent){
        System.out.println(message.formatted(userRegisteredEvent.getName()));
    }
}
