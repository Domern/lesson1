package com.geekbrains.spring.homework;

import lombok.Data;

@Data
public class Product {
    private static int initId;
    private int id;
    private String name;
    private int coast;

    public Product() {
        id=initId++;
        name="NULL";
        coast=0;
    }
}
