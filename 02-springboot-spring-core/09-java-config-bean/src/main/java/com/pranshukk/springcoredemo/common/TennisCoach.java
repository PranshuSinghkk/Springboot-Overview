package com.pranshukk.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    TennisCoach() {
        System.out.println("Tennis Coach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis Coach";
    }
}
