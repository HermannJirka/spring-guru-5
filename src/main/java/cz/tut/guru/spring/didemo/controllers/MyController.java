package cz.tut.guru.spring.didemo.controllers;

import cz.tut.guru.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("SASKU");
        return "Hello";
    }
}
