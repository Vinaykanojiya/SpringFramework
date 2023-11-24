package com.krloyar.springcore.config;

import com.krloyar.springcore.common.Coach;
import com.krloyar.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean
    Coach swimcoach(){
        return new SwimCoach();
    }
}
