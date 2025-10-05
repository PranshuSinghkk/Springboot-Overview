package com.pranshukk.springcoredemo.common;

import org.springframework.stereotype.Component;

// this annotation marks the class as Spring Bean
@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach";
    }
}
