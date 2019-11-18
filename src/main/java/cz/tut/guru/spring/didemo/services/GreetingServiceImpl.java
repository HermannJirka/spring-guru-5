package cz.tut.guru.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GREETINGS = "HELLO GREETINGS";

    @Override
    public String sayGreeting() {
        return HELLO_GREETINGS;
    }
}
