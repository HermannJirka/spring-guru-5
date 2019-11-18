package cz.tut.guru.spring.didemo.controllers;

import cz.tut.guru.spring.didemo.services.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @Before
    public void setUp(){
        this.controller = new SetterInjectedController();
        this.controller.setService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(GreetingServiceImpl.HELLO_GREETINGS,controller.sayHello());
    }
}
