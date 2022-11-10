package com.geekbrains.spring.orderservice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OrderNameService {
    private static Long orderSequence=1L;

    @PostConstruct
    public void init() {
        System.out.println("Create new OrderNameService Bean");
    }

    public void initName(Order order) {
        order.setName("Order #" + orderSequence++);
    }
}
