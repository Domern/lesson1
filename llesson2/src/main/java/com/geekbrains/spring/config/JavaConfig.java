package com.geekbrains.spring.config;

import com.geekbrains.spring.orderservice.OrderNameService;
import com.geekbrains.spring.orderservice.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {
    @Bean
    public OrderService orderService(OrderNameService orderNameService) {
        return new OrderService(orderNameService);
    }

    @Bean
    public OrderNameService orderNameService() {
        return new OrderNameService();
    }

    @Bean("first")
    @Primary
    public String firstStringBean(){
        return "I'm First String Bean";
    }

    @Bean("second")
    public String secondStringBean(){
        return "I,m Second String Bean";
    }
}
