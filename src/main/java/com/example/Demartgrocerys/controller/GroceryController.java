package com.example.Demartgrocerys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demartgrocerys.entity.Demartgrocery;
import com.example.Demartgrocerys.service.GroceryService;

@RestController
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping("/demart/all")
    public List<Demartgrocery> getAllItems() {
        return groceryService.getAllItems();
    }
}
