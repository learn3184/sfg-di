package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String getGreetings() {
        return "Hello World - Setter";
    }
}
