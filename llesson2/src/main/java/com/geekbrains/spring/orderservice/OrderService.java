package com.geekbrains.spring.orderservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class OrderService {
    //field injection
//    @Autowired
//    private OrderNameService orderNameSequence;
    private OrderNameService orderNameSequence;

    //constructor injection
    @Autowired
    public OrderService(OrderNameService orderNameSequence) {
        this.orderNameSequence = orderNameSequence;
    }

    //setter injection
//    @Autowired
//    public void setOrderNameSequence(OrderNameService orderNameSequence) {
//        this.orderNameSequence = orderNameSequence;
//    }
    @PostConstruct
    public void init() {
        System.out.println("Create new OrderService Bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Delete OrderService Bean");
    }

    public Order createNewOrder() {
        Order order = new Order();
        orderNameSequence.initName(order);
        return order;
    }
}
