package com.geekbrains.spring.homework;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.geekbrains.spring.homework");
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Cart cart1 = context.getBean(Cart.class);
        cart1.setProducts(productRepository.getAllProducts());
        cart1.newProductInCat(3);
        cart1.newProductInCat(2);
        cart1.newProductInCat(1);
        System.out.println(cart1.getProductsInCart());
        cart1.deleteProductInCatById(2);
        System.out.println(cart1.getProductsInCart());


        Cart cart2 = context.getBean(Cart.class);
        cart2.setProducts(productRepository.getAllProducts());
        cart2.newProductInCat(0);
        cart2.newProductInCat(2);
        cart2.newProductInCat(4);
        System.out.println(cart2.getProductsInCart());
        cart2.deleteProductInCatById(2);
        System.out.println(cart2.getProductsInCart());

    }
}
