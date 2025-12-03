package com.example.Demartgrocerys.entity;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Demartgrocery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer cost;
    private BigDecimal quantity;
    private LocalTime time;        // For time

    // ✅ Default constructor
    public Demartgrocery() {}

    // ✅ Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getCost() { return cost; }
    public void setCost(Integer cost) { this.cost = cost; }

    public BigDecimal getQuantity() { return quantity; }
    public void setQuantity(BigDecimal quantity) { this.quantity = quantity; }


    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }
}
