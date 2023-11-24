package com.krloyar.springcore.controlar;

import com.krloyar.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroler {

    Coach thecoach;

    //construction injection
    public Homecontroler(@Qualifier("cricketCoach") Coach thecoach) {
        this.thecoach = thecoach;
    }

    @GetMapping("/dailyWorkout")
    public String sayHello(){
        return "hey girl";
    }
    @GetMapping("/cricket")
    public String sayVada(){
        return thecoach.getDailyWorkout();
    }

}
