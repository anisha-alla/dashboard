package com.example.dashboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Product {
    @Id
    private String id;
    private String name;
    private String countryCode;
    private Integer price;

    public Product(String name, String countryCode, Integer price) {
        this.name = name;
        this.countryCode = countryCode;
        this.price = price;
    }

    // Getters and Setters
}
