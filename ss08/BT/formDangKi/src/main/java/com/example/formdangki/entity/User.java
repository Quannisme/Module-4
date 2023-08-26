package com.example.formdangki.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "varchar(50)")
    private String id;
    @NotBlank(message = "{User.firstName}")
    @Size(min = 5 , max = 45 , message = "{User.nameSize}")
    private String firstName;
    @NotBlank(message = "{User.lastName}")
    @Size(min = 5 , max = 45 , message = "{User.nameSize}")
    private String lastName;
    @NotBlank(message = "{User.phone}")
    @Pattern(regexp = "^0\\d{9}$" , message = "{User.formatPhone}")
    private String phoneNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/((19|20)\\d{2})$" ,message = "{User.age}")
    private Date birthday;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$" ,message = "{User.email}")
    private String email;

    public User() {
    }

    public User(String id, String firstName, String lastName, String phoneNumber, Date birthday, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
