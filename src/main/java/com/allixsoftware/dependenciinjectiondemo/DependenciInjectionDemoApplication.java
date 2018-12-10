package com.allixsoftware.dependenciinjectiondemo;

import com.allixsoftware.dependenciinjectiondemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependenciInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext cntx = SpringApplication.run(DependenciInjectionDemoApplication.class, args);
        MyController controller =(MyController) cntx.getBean("myController");
        controller.hola();
    }
}
