package com.krloyar.springcore.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Inside SwimCoach constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000 meter";
    }
}
