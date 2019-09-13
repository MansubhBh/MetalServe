package com.metal.service;


import com.metal.entity.Developer;

import java.util.List;

public interface GreetingService {

    String getGeneralGreeting();
    String getNamedGreeting(String name);
    List<Developer> getall();
    List<Developer> getByLevel(String level);

}
