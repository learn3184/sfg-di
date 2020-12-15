package com.springframework.sfgdi.controller;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    private GreetingService greetingService;

    public String sayHello()
    {
        return this.greetingService.getGreetings();
    }
}
