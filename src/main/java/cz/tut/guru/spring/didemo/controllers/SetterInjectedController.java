package cz.tut.guru.spring.didemo.controllers;

import cz.tut.guru.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService service;

    String sayHello() {
        return service.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingService")
    public void setService(GreetingService service) {
        this.service = service;
    }
}
