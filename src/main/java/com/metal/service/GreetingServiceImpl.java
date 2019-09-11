package com.metal.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String getGeneralGreeting() {
        return "Hi there! Hope your having a good day";
    }

    @Override
    public String getNamedGreeting(String name) {
        return "Hi " + name + "!! Hope you have a gread day ahead";
    }
}
