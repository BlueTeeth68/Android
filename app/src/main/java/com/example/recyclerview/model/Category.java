package com.example.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Category {
    private String name;
    private int img;
    List<Product> products = new ArrayList<>();

    public Category(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
