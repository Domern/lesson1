package com.geekbrains.spring.homework;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Data
@Component
public class ProductRepository {
    private List<Product> products=new ArrayList<>();

    @Bean("PR")
    public List products(){
        return products;
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            product.setName("Product"+i);
            product.setCoast(i*12+5);
            products.add(product);
        }
    }

    public List getAllProducts(){
        return products;
    }
    public Product getProductById (int id){
        for (Product product : products) {
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }
}
