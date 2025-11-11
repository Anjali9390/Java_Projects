package com.example.Vehicle.Management.System;

import com.example.Vehicle.Management.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Vehicle Management System!";
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Vehicle getById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    @PostMapping
    public Vehicle add(@RequestBody Vehicle v) {
        return vehicleService.addVehicle(v);
    }

    @PostMapping("/addAll")
    public List<Vehicle> addAllVehicles(@RequestBody List<Vehicle> vehicles) {
        return vehicleService.addAllVehicles(vehicles);
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable Long id, @RequestBody Vehicle v) {
        return vehicleService.updateVehicle(id, v);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return "Vehicle Deleted Successfully";
    }
}
