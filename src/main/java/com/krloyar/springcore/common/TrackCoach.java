package com.krloyar.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach{

    TrackCoach(){
        System.out.println("Inside Trackcoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run heard 50km";
    }
}
