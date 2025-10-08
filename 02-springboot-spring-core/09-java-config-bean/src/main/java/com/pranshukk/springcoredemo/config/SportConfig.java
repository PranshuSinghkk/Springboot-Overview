package com.pranshukk.springcoredemo.config;

import com.pranshukk.springcoredemo.common.Coach;
import com.pranshukk.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //@Bean   // this is used to manually create a spring bean using @Configuration annotation and @Bean annotation
            // UseCase- takes existing third party class and exposes it as a spring bean
    @Bean("aquatic")    // we can also give a custom bean id(name) to the bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
