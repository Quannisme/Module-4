package com.example.casestudy.entity.customer;

import com.example.casestudy.util.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer12")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int id;
    @Column(name = "customer_name" , columnDefinition = "varchar(45)")
    private String name;
    @Column(name = "customer_birthday")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private java.util.Date birthDay;
    @Column(name = "customer_gender")
    private Gender gender;
    @Column(name = "customer_idCard" , columnDefinition = "varchar(45)")
    private String idCard;
    @Column(name = "customer_phone" , columnDefinition = "varchar(45)")
    private String phone;
    @Column(name = "customer_email" , columnDefinition = "varchar(45)")
    private String email;
    @Column(name = "customer_address" , columnDefinition = "varchar(45)")
    private String address;
    @ManyToOne
    @JoinColumn(name = "customer_Type_Id")
    private CustomerType customerType;
    public Customer() {
    }

    public Customer(int id, String name, Date birthDay, Gender gender, String idCard, String phone, String email, String address, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
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

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    public java.util.Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(java.util.Date birthDay) {
        this.birthDay = birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
