package com.example.Vehicle.Management.System;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repo;

    public List<Vehicle> getAllVehicles() {
        return repo.findAll();
    }

    public Vehicle getVehicleById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Vehicle addVehicle(Vehicle v) {
        return repo.save(v);
    }

    public Vehicle updateVehicle(Long id, Vehicle v) {
        Vehicle old = repo.findById(id).orElse(null);
        if(old != null){
            old.setname(v.getname());
            old.setmodel(v.getmodel());
            old.setprice(v.getprice());
            return repo.save(old);
        }
        return null;
    }

    public void deleteVehicle(Long id) {
        repo.deleteById(id);
    }
}
