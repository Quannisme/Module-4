package com.example.casestudy.dto;

import com.example.casestudy.util.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class CustomerDto {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private java.util.Date birthDay;
    private Gender gender;
    @NotBlank(message = "{customer.idCard}")
    @Pattern(regexp = "^\\d{9}$|^\\d{12}$",message = "{customer.formatIdCard}")
    private String idCard;
    @NotBlank(message = "{customer.phone}")
    @Pattern(regexp = "^0\\d{9}$" , message = "{customer.formatPhone}")
    private String phone;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$" ,message = "{customer.email}")
    private String email;
    private String address;
    private int customerType;

    public CustomerDto() {
    }

    public CustomerDto(int id, String name, Date birthDay, Gender gender, String idCard, String phone, String email, String address, int customerType) {
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
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

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }
}
