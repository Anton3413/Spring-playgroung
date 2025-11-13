package com.anton3413.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserRegisteredEvent {

   private  String name;
}
