package com.example.Thi_WCD.entity;

public class Phone {
    private int id;
    private String name;
    private Double price;
    private String brand;
    private String description;

    public Phone(String name) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public Phone() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
