package com.geekbrains.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StringConteiner {

    @Autowired
    @Qualifier("second")
    private String bean;

    @PostConstruct
    public void init(){
        System.out.println("injected "+bean);
    }

}
