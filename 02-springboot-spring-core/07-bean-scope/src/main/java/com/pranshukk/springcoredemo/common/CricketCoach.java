package com.pranshukk.springcoredemo.common;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    CricketCoach() {
        System.out.println("Cricket Coach Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Cricket Coach";
    }
}
