package com.example.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//This annotation is responsible for collecting http request and sending http responses
public class HelloController {

    @RequestMapping("/hello")
    //Rest API
    public String sayHi(){
        return "Hi";
    }


}
