package com.phengmengheak.startspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StartSpringApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}
