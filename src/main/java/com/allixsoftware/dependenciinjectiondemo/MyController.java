package com.allixsoftware.dependenciinjectiondemo;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hola(){
        System.out.println("Hello");
        return "foo";
    }
}
