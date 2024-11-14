package com.example.dashboard.repository;

import com.example.dashboard.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepository extends MongoRepository<Product, String> {}
