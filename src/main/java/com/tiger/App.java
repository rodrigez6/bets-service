package com.tiger;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String [] args){
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(App.class);
        ApplicationContext applicationContext = springApplicationBuilder.run(args);
    }
}
