package com.allixsoftware.dependenciinjectiondemo.controller;

import com.allixsoftware.dependenciinjectiondemo.services.GreetingService;

public class GreeterInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
