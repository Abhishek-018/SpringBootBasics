package com.example.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//This annotation tells spring boot that this is the starting point of
//application, and it is a spring application
@SpringBootApplication

public class LearningApplication {

	public static void main(String[] args) {
		//SpringApplication is a  class which has a method run which takes
		//two arguments.First arguments is the class which have main method
		//Second Argument is the argument is the args of main method.
		//By mentioning the below line it has started servlet container.
		SpringApplication.run(LearningApplication.class, args);
	}

}
