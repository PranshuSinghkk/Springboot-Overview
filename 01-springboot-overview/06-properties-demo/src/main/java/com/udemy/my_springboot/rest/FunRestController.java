package com.udemy.my_springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // @Value is injecting the value that's defined in application.properties file..
    @Value("${pirate.name}")
    private String captainName;

    @Value("${pirate.crew.name}")
    private String crewName;

    @GetMapping("pirate")
    public String pirateInfo() {
        return "Captain's Name: "+captainName+" and Pirate Crew Name: "+crewName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
