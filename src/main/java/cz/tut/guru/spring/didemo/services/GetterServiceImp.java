package cz.tut.guru.spring.didemo.services;

public class GetterServiceImp implements GreetingService{

    @Override
    public String sayGreeting() {
        String sayHello = "Hello";
        return sayHello;
    }
}
