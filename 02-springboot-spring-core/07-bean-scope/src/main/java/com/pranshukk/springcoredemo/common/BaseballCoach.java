package com.pranshukk.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// this annotation marks the class as Spring Bean
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Prototype will create new object for each injection
public class BaseballCoach implements Coach {

    BaseballCoach() {
        System.out.println("Baseball Coach Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball Coach";
    }
}
