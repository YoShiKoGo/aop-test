package com.aop.aoptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.aop")
@SpringBootApplication
public class AopTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);
    }

}
