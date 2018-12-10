package com.allixsoftware.dependenciinjectiondemo.controler;

import com.allixsoftware.dependenciinjectiondemo.controller.PropertyInjectedController;
import com.allixsoftware.dependenciinjectiondemo.services.GreetingService;
import com.allixsoftware.dependenciinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;


    @Before
    public void setUp(){
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceImpl();
    }

    @Test
    public void testGreting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
