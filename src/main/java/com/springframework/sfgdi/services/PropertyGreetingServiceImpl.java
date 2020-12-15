package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

    @Override
    public String getGreetings() {
        return "Hello World - Property";
    }
}
