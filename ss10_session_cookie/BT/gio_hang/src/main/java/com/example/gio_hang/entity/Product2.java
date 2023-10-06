package com.example.gio_hang.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product2 {
    @Id
    @GeneratedValue
    private int id;
    private String img;
    private String description;
    private double prices;

    public Product2() {
    }

    public Product2(int id, String img, String description, double prices) {
        this.id = id;
        this.img = img;
        this.description = description;
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

}
