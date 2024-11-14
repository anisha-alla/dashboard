package com.example.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dashboard.model.Product;
import com.example.dashboard.repository.MongoRepository;

@RestController
public class DataController {

    @Autowired
    private MongoRepository mongoRepository;

    @GetMapping("/api/data")
    public List<Product> getData() {
        return mongoRepository.findAll();
    }
}
