package com.example.casestudy.entity.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer_Type")
public class CustomerType {
    @Id
    @Column(name = "customer_Type_Id" )
    private int typeId;
    @Column(columnDefinition = "varchar(45)" , name = "customer_Type_name")
    private String typeName;
    @JsonBackReference
    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
