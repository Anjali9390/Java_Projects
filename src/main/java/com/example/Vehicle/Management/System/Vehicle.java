package com.example.Vehicle.Management.System;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
    private String vehicleName;
    private String vehicleType;
    private String vehicleNumber;

    public Vehicle() {}

    public Vehicle(String vehicleName, String vehicleType, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
}
