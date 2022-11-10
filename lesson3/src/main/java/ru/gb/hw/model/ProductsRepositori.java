package ru.gb.hw.model;

import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Data
public class ProductsRepositori {
    private List<Product> products=List.of(
            new Product(1,"Product 1", 10),
            new Product(2,"Product 2", 20),
            new Product(3,"Product 3", 30),
            new Product(4,"Product 4", 40),
            new Product(5,"Product 5", 50)
    );

    public Product getProductById(int id){
        Product product=products.stream().
                filter(it -> Objects.equals(id, it.getId()))
                .findFirst()
                .orElse(null);
        return product;
    }




}
