package com.pranshukk.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    TrackCoach() {
        System.out.println("Track Coach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Track Coach";
    }
}
