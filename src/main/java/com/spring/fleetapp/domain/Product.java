package com.spring.fleetapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
//@RequiredArgsConstructor
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private  String name;
    private Float price;
    private String location;
    private String serialNumber;

    public Product(Integer id, String name, Float price, String location, String serialNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location=location;
        this.serialNumber= serialNumber;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
