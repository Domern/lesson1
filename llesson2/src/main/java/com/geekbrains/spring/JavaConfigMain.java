package com.geekbrains.spring;

import com.geekbrains.spring.config.StringConteiner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaConfigMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context1 = new AnnotationConfigApplicationContext("com.geekbrains.spring.config");

//        String[] beanDefinitionNames = context1.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

//        Object first = context1.getBean("first");
//        System.out.println(first);

//         String bean = context1.getBean(String.class);
//        System.out.println(bean);

        //StringConteiner bean = context1.getBean(StringConteiner.class);
    }
}
