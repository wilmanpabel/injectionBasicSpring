package com.allixsoftware.dependenciinjectiondemo.controller;

import com.allixsoftware.dependenciinjectiondemo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }



}
