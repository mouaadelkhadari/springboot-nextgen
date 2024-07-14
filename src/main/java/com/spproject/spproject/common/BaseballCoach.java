package com.spproject.spproject.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes in bating practice";
    }
}
