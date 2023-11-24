package com.krloyar.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class Cricketcoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice 30 min";
    }
}
