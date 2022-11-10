package com.geekbrains.spring.orderservice;

import lombok.Getter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//scope session
//scope request

//@Lazy-создание бина только при первом обращении к нему
public class Box {
    private static long id_sequence=1L;

    @Getter
    private final long id;


    public Box() {
        this.id = id_sequence++;
    }

    @PostConstruct
    public void init(){
        System.out.println("Box #"+id+" create");
    }
}
