package com.geekbrains.spring.homework;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Data
public class Cart {
    private List<Product> products;

    private List<Product> productsInCart=new ArrayList<>();

    private Cart(){}


    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void newProductInCat(int id){
        for (Product product : products) {
            if(product.getId()==id){
                productsInCart.add(product);
            }
        }
    }

    public void deleteProductInCatById(int id){
        for (Product product : productsInCart) {
            if(product.getId()==id){
                productsInCart.remove(product);
            }
        }
    }
}
