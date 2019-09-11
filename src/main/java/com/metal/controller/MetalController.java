package com.metal.controller;


import com.metal.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

}
