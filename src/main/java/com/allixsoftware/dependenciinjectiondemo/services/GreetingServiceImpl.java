package com.allixsoftware.dependenciinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS="Hola todo el mundo en este proyecto implementaremos la inyeccióm manual para conprender el trabajo de  spring";


    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
