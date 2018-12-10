package com.allixsoftware.dependenciinjectiondemo.controller;


import com.allixsoftware.dependenciinjectiondemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

   public String sayHello(){
        return greetingService.sayGreeting();
    }


}
