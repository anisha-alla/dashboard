package com.example.dashboard.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dashboard.model.Product;
import com.example.dashboard.repository.MongoRepository;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@Service
public class CsvDataService {

    @Autowired
    private MongoRepository mongoRepository;

    public void readCsvAndSaveToDb(String filePath) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> rows = reader.readAll();
            rows.forEach(row -> {
                Product data = new Product(row[0], row[1], Integer.valueOf(row[2])); // Adapt as per your CSV structure
                mongoRepository.save(data);
            });
        }
    }
}
