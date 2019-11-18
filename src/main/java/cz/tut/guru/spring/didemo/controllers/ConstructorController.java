package cz.tut.guru.spring.didemo.controllers;

import cz.tut.guru.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    private final GreetingService greetingService;

    public ConstructorController(@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
