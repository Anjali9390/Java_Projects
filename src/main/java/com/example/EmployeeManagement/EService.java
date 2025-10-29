package com.example.EmployeeManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EService {

    @Autowired
    private Erepository repo;

    public List<Employee> getALLEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateEmployee(Long id, Employee newEmployee) {
        Employee old = repo.findById(id).orElse(null);

        if (old != null) {
            old.setdeptname(newEmployee.getdeptname());
            old.setcompanyname(newEmployee.getcompanyname());
            return repo.save(old);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}

