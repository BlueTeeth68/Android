package com.example.recyclerview.Model;

@SuppressWarnings("unused")
public class Product {

    private int img;
    private String name;
    private String description;
    private Category category;

    public Product(int img, String name, String description, Category category) {
        this.img = img;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
