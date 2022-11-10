package ru.gb.hw.model;

import lombok.Getter;

@Getter
public class Product {
    private final int id;
    private final String title;
    private final int coast;

    public Product(int id, String title, int coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }
}
