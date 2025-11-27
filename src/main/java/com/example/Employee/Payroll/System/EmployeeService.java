package com.example.Employee.Payroll.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateSalary(Long id, double salary) {
        Employee emp = repo.findById(id).orElse(null);
        if(emp != null){
            emp.setSalary(salary);
            return repo.save(emp);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}

