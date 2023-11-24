package com.krloyar.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class KhokhoCoach implements Coach{

    KhokhoCoach(){
        System.out.println("Inside khokhocoach constructor");
    }



    @Override
    public String getDailyWorkout() {
        return "Run for your life";
    }
}
