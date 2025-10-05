package com.pranshukk.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// this annotation marks the class as spring bean
@Component
//@Primary //- using this spring will automatically inject this Coach when we run our app, if we dont specify it using @Qualifier...
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Cricket Coach";
    }
}
