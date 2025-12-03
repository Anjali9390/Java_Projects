package com.example.Demartgrocerys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demartgrocerys.entity.Demartgrocery;
import com.example.Demartgrocerys.dao.GroceryRepository;

@Service
public class GroceryService {

    @Autowired
    private GroceryRepository groceryRepository; // instance, NOT static

    // Use this method to get all items
    public List<Demartgrocery> getAllItems() {
        return groceryRepository.findAll(); // called from object, NOT class
    }
}
