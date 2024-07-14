package com.spproject.spproject.common;

import com.spproject.spproject.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
