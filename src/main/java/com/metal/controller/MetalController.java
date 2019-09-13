package com.metal.controller;


import com.metal.entity.Developer;
import com.metal.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MetalController {

    private final GreetingService greetingService;

    @Autowired
    public MetalController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/message/{name}")
    public String getNamedMessage(@PathVariable("name") String name){
        return greetingService.getNamedGreeting(name);
    }

    @GetMapping("/greeting")
    public String getGreeting(){
        return greetingService.getGeneralGreeting();
    }

    @GetMapping("/developers/all")
    public List<Developer> getAllDevelopers(){
        return greetingService.getall();
    }

    @GetMapping("/developers")
    public List<Developer> getDevelopersByRole(@RequestParam("level") String level){
        return greetingService.getByLevel(level);
    }

}
