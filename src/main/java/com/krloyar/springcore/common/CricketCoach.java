package com.krloyar.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

    CricketCoach(){
        System.out.println("Inside Cricketcoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 30 min";
    }
}
