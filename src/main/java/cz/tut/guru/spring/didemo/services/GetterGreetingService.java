package cz.tut.guru.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Sayy helooo";
    }
}
