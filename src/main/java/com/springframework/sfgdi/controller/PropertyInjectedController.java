package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.getGreetings();
    }
}