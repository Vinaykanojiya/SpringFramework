package com.krloyar.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Trackcoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run heard 50km";
    }
}
