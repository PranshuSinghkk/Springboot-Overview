package com.pranshukk.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// this annotation marks the class as Spring Bean
@Component
public class BaseballCoach implements Coach {

    BaseballCoach() {
        System.out.println("Baseball Coach Constructor");
    }

    // defining init method
    @PostConstruct
    public void doStartUpStuff() {
        System.out.println("In doStartUpStuff(): " + getClass().getSimpleName());
    }
    // defining destroy method
    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("In doCleanUpStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach";
    }
}
