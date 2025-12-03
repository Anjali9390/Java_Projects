package com.example.Demartgrocerys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Demartgrocerys.entity.Demartgrocery;

public interface GroceryRepository extends JpaRepository<Demartgrocery, Integer> {
	
}
