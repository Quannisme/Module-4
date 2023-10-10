package com.example.final_module3.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product12")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "idProduct")
    private int id;
    @NotNull
    @NotBlank(message = "Ten khong hop le")
    @Column(name = "nameProduct",columnDefinition = "varchar(50)")
    private String name;
    @NotNull(message = "Gia khong hop le ")
    @Min(value = 100000 , message = "Gia khong hop le")
    @Column(name = "priceProduct")
    private double price;
    @NotBlank(message = "Trang thai khong hop le")
    @Column(name = "statuc",columnDefinition = "varchar(45)")
    private String status;
    @ManyToOne
    @JoinColumn(name ="idCategory" )
    private Category category;

    public Product() {
    }

    public Product(int id, String name, double price, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
