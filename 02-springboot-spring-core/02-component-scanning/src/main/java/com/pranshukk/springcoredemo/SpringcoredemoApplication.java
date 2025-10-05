package com.pranshukk.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// if some pakages are outside the main base package, then the default spring compnenetScan wont delect those, So we have to explicitly tell soring boot what to scan...
//@SpringBootApplication( scanBasePackages = {
//		"com.pranshukk.springcoredemo",
//		"com.pranshukk.util"
//		})


@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
