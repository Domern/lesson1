package com.geekbrains.spring;

import com.geekbrains.spring.orderservice.Box;
import com.geekbrains.spring.orderservice.Order;
import com.geekbrains.spring.orderservice.OrderNameService;
import com.geekbrains.spring.orderservice.OrderService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Bean
        //IoC-Inversion of Control-инверсия контроля

        //Dependency Injection-внедрение зависимостей


        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.geekbrains.spring.orderservice");

        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());
        System.out.println(context.getBean(Box.class).getId());


//        OrderService orderService = context.getBean(OrderService.class);
//
//        Order order = orderService.createNewOrder();
//        System.out.println(order);
//
//
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//        System.out.println(orderService.createNewOrder());
//
//        context.close();
    }
}
