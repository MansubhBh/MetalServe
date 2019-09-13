package com.metal.service;

import com.metal.entity.Developer;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Developer> getall() {
        return populateDevelopers();
    }

    @Override
    public List<Developer> getByLevel(String level) {
        List<Developer> listDev = populateDevelopers();
         return listDev.stream().filter(dev -> dev.getLevel().equalsIgnoreCase(level)).collect(Collectors.toList());
    }

    private List<Developer> populateDevelopers(){
        return Arrays.asList(new Developer("John travalta",24, "MID",new BigDecimal(120000)) ,
                new Developer("Cersie Lannister",34,"SENIOR",new BigDecimal(200000)),
                new Developer("Jack ma",21,"JUNIOR",new BigDecimal(70000)),
                new Developer("Jason Obrel",25,"MID",new BigDecimal(90000)),
                new Developer("Matteo Darmian",31,"SENIOR",new BigDecimal(180000)),
                new Developer("Nemanja Vidic",22,"JUNIOR",new BigDecimal(75000))
                );
    }
}
