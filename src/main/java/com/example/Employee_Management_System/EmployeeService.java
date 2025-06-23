package com.example.Employee_Management_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteById(Long id) {
        repository.deleteById(id);
        return "Deleted Successfully!";
    }

    public Employee update(Employee emp) {
        return repository.save(emp);
    }
}
