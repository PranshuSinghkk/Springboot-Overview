package com.pranshukk.springcoredemo.rest;

import com.pranshukk.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach,
                            @Qualifier("baseballCoach") Coach theAnotherCoach) {
        System.out.println("In Constructor: " +getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // for checking the scope of the bean
    // by default the scope is Singleton
    @GetMapping("/check")
    public String check() {
        return "Comparing bean: myCoach == anotherCoach, "+ (myCoach == anotherCoach);
    }
}
