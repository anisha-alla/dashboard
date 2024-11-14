package com.example.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dashboard.model.Product;
import com.example.dashboard.repository.MongoRepository;

@Controller
public class DashboardController {

    @Autowired
    private MongoRepository mongoRepository;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<Product> dataList = mongoRepository.findAll();
        model.addAttribute("dataList", dataList);
        return "dashboard";
    }
}
