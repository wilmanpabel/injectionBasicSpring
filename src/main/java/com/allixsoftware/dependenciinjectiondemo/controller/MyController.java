package com.allixsoftware.dependenciinjectiondemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hola(){
        System.out.println("Hello");
        return "foo";
    }
}
