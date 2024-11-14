package com.example.dashboard;

import com.example.dashboard.service.CsvDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CsvDataService csvDataService;

    @Override
    public void run(String... args) throws Exception {
        csvDataService.readCsvAndSaveToDb("C://downloads/data.csv");
    }
}
