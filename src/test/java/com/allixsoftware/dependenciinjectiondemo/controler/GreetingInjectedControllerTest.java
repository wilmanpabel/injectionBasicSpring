package com.allixsoftware.dependenciinjectiondemo.controler;

import com.allixsoftware.dependenciinjectiondemo.controller.GreeterInjectedController;
import com.allixsoftware.dependenciinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingInjectedControllerTest {
    private GreeterInjectedController greeterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.greeterInjectedController=new GreeterInjectedController();
        this.greeterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,greeterInjectedController.sayHello());
    }
}
