package com.pranshukk.springcoredemo;

import org.springframework.stereotype.Component;

// this annotation marks the class as spring bean
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for fifteen minutes!!!!";
    }
}
